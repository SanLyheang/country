package com.example.country_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Create an array of 100 country names
    String[] CountryName = {"Cambodia", "Thailand", "Laos", "Vietnam", "Malaysia", "Philipine", };
    String[] detail = {"This is Cambodia", "This is Thailand", "This is Laos", "This is Vietnam", "This is Malaysia", "This is Philipine",};
     int[] img={R.drawable.cambodia,R.drawable.thailand,R.drawable.laos,R.drawable.vietnam,R.drawable.malaysia,R.drawable.philipine};
    ListView lvCountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCountry = findViewById(R.id.lvCountry);
        ArrayAdapter<String> myAdapder =new ArrayAdapter<String>(this,R.layout.single_row,R.id.txtCountryName,CountryName);
        lvCountry.setAdapter(myAdapder);

        lvCountry.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                String str = (String) parent.getItemAtPosition(i);
                Toast.makeText(MainActivity.this,str , Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(MainActivity.this,detail_country.class);
                intent.putExtra("countryName",str);
                intent.putExtra("detail",detail[i]);
                intent.putExtra("img",img[i]);

                startActivity(intent);
            }


        });

    }
}
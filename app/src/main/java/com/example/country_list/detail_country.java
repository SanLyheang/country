package com.example.country_list;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class detail_country extends AppCompatActivity {
ImageView imgCountry;
TextView title,detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_country);
        imgCountry=(ImageView) findViewById(R.id.imgCountry);
        title=(TextView) findViewById(R.id.title);
        detail=(TextView) findViewById(R.id.detail);

        Intent getData=getIntent();
        String countryName,strDetail;
        countryName=getData.getStringExtra("countryName");
        strDetail=getData.getStringExtra("detail");

        title.setText("Welcome to "+countryName);
        detail.setText(strDetail);

    }
}
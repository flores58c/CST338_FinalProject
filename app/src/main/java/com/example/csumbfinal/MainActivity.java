package com.example.csumbfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button setting;
    TextView numbers;
    TextView colors;
    TextView fam;
    TextView phrases;


    //method sets all the textViews with OnClickListeners and Intents to send to other views
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //setting = (Button) findViewById(R.id.settings);
        numbers = (TextView) findViewById(R.id.numbers);
        colors = (TextView) findViewById(R.id.colors);
        fam = (TextView) findViewById(R.id.family);
        phrases = (TextView) findViewById(R.id.phrases);


        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numberPage = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(numberPage);
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cPage = new Intent(MainActivity.this, colors.class);
                startActivity(cPage);
            }
        });

        fam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fPage = new Intent(MainActivity.this, family.class);
                startActivity(fPage);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pPage = new Intent(MainActivity.this, phrases.class);
                startActivity(pPage);
            }
        });


    }

    //tried implementing setting for a dark mode but I think I need to do it from
    //empty activity
    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main,menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId())
        {
        case R.id.settings:
            Intent settingPage = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(settingPage);

            break;
            }
        return super.onOptionsItemSelected(item);
    }*/

}
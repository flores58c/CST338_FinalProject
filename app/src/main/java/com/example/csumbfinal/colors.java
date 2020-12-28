package com.example.csumbfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class colors extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        //adds all the japanese color words to arrayList
        ArrayList<Word> japColor = new ArrayList<Word>();
        japColor.add(new Word("Ao", "Blue"));
        japColor.add(new Word("Aka", "Red"));
        japColor.add(new Word("Orenjii", "Orange"));
        japColor.add(new Word("Chairo", "Brown"));
        japColor.add(new Word("Shirroi", "White"));
        japColor.add((new Word("Murasaki", "Purple")));
        japColor.add((new Word("Midori", "Green")));
        japColor.add((new Word("Kiiro", "Yellow")));
        japColor.add((new Word("Murasaki", "Purple")));
        japColor.add((new Word("Kuro", "Black")));


        //constructor that adds the color,array, and connects it to the listview
        wordAdapter colorAdapter = new wordAdapter(this, japColor, R.color.design_default_color_primary);

        ListView listView = (ListView) findViewById(R.id.colorView);

        listView.setAdapter(colorAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //connects custom menu that adds MainMenu button on action bar
        getMenuInflater().inflate(R.menu.menu2, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            //this makes sure the menu button on action bar is able to send back to mainActivity
            case R.id.mM:
                Intent settingPage = new Intent(colors.this, MainActivity.class);
                startActivity(settingPage);


                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
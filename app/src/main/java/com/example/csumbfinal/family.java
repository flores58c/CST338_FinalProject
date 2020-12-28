package com.example.csumbfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_family);

        //creating a arrayList of custom type Word for family
        ArrayList<Word> japFam = new ArrayList<Word>();
        japFam.add(new Word("父 Otoosan", "Your father"));
        japFam.add(new Word("chichi", "My father"));
        japFam.add(new Word("母 Okaasan", "Your mother"));
        japFam.add(new Word("Haha", "My mother"));
        japFam.add(new Word("Itoko", "Cousin"));
        japFam.add(new Word("Ojii-san", "Your grandfather"));
        japFam.add(new Word("Sofu", "My grandfather"));
        japFam.add(new Word("Ani", "Older brother"));
        japFam.add(new Word("Ane", "Older sister"));
        japFam.add(new Word("Otooto", "Younger brother"));
        japFam.add(new Word("Imooto", "Younger sister"));

        //constructor that adds the color,array, and connects it to the listview
        wordAdapter itemsAdapter = new wordAdapter(this, japFam, R.color.teal_200);

        ListView listView = (ListView) findViewById(R.id.famList);


        listView.setAdapter(itemsAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //connects custom menu that adds MainMenu button on action bar
        getMenuInflater().inflate(R.menu.menu2, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        //this makes sure the menu button on action bar is able to send back to mainActivity
        switch (item.getItemId()) {
            case R.id.mM:
                Intent settingPage = new Intent(family.this, MainActivity.class);
                startActivity(settingPage);


                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
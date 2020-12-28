package com.example.csumbfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        //creating a arrayList of custom type Word for numbers
        ArrayList<Word> japNums = new ArrayList<Word>();
        japNums.add(new Word("一 ichi", "one"));
        japNums.add(new Word("二 ni", "two"));
        japNums.add(new Word("三 san", "three"));
        japNums.add(new Word("四 shi", "four"));
        japNums.add(new Word("五 go", "five"));
        japNums.add(new Word("六 roku", "six"));
        japNums.add(new Word("七 shichi", "seven"));
        japNums.add(new Word("八 hachi", "eight"));
        japNums.add(new Word("九 ku", "nine"));
        japNums.add(new Word("十 juu", "ten"));
        japNums.add(new Word("百 hyaku", "hundred"));
        japNums.add(new Word("千 sen", "thousand"));
        japNums.add(new Word("万 man", "ten-thousand"));

        //constructor to makes sure all the Words get into list view and background is black
        wordAdapter itemsAdapter = new wordAdapter(this, japNums, R.color.black);

        ListView listView = (ListView) findViewById(R.id.list);


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
                Intent settingPage = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(settingPage);


                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
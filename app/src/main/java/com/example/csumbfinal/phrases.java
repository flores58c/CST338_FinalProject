package com.example.csumbfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        //adds all the japanese phrase words to arrayList
        ArrayList<Word> sentence = new ArrayList<Word>();
        sentence.add(new Word("Anata no onamae wa nan desu ka?", "What is your name?"));
        sentence.add(new Word("Nan ji kan?", "How long?"));
        sentence.add(new Word("Shigoto wa nan desu ka?", "What is your job?"));
        sentence.add(new Word("Anata wa asagohan o tabemasu ka?", "Did you eat breakfast?"));
        sentence.add(new Word("Ima nan ji desu ka?", "What time is it now?"));
        sentence.add(new Word("Sumimasen", "Excuse me."));
        sentence.add(new Word("Hai", "Yes"));
        sentence.add(new Word("Ie", "No"));
        sentence.add(new Word("Ohayō gozaimasu.", "Good morning."));
        sentence.add(new Word("Konichiwa", "Hello"));
        sentence.add(new Word("Konbanwa", "Good evening"));


        //constructor that adds the color,array, and connects it to the listview
        wordAdapter pAdapter = new wordAdapter(this, sentence, R.color.burgundy);

        ListView listView = (ListView) findViewById(R.id.phraseView);

        listView.setAdapter(pAdapter);
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
                Intent settingPage = new Intent(phrases.this, MainActivity.class);
                startActivity(settingPage);


                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
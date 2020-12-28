package com.example.csumbfinal;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.core.content.ContextCompat;

public class wordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    //constructor takes care of parent(super) second parameter setting
    wordAdapter(Activity context, ArrayList<Word>  numWords, int colorResourceId)
    {

        super(context,0,numWords);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
      View listItemView = convertView;

      if(listItemView== null)
      {
          listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
      }

      Word w1 = getItem(position);

        TextView japView =  (TextView)listItemView.findViewById(R.id.tView1);

        Word w2 = getItem(position);


        // set this text on the jap TextView
        japView.setText(w1.getTranslate());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.tView2);

        // set this text on the english TextView
        numberTextView.setText(w2.getEnglish());


        View textContainer = listItemView.findViewById(R.id.wordContainer);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);


        //sets the background of listView
        textContainer.setBackgroundColor(color);
      return listItemView;

    }



}

package com.example.csumbfinal;

import androidx.annotation.NonNull;

//class made for array list so the view can easily get two strings
public class Word {



    //Strings to hold the values for the view
    String translate;
    String english;

    Word()
    {
        translate = "N/A set in other constructor or accessor";
        english ="N/A set in other constructor or accessor";
    }

    //constructor for setting Strings
    Word(String s1 ,String s2)
    {
        translate = s1;
        english = s2;
    }

    //accessors
    public String getTranslate()
    {
        return translate;
    }

    public String getEnglish()
    {
        return english;
    }

    //setters
    public void setTranslate(String translate)
    {
        this.translate = translate;
    }

    public void setEnglish(String english)
    {
        this.english = english;
    }

    //toString
    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}

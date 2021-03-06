package com.example.android.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> colors = new ArrayList<Word>();

        colors.add( new Word("red","weṭeṭṭi",R.drawable.color_red));
        colors.add( new Word("green","chokokki",R.drawable.color_green));
        colors.add( new Word("brown","akaakki",R.drawable.color_brown));
        colors.add( new Word("gray","topoppi",R.drawable.color_gray));
        colors.add( new Word("black","kululli",R.drawable.color_black));
        colors.add( new Word("white","kelelli",R.drawable.color_white));
        colors.add( new Word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        colors.add( new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(
                this, colors,R.color.category_colors);

        // for list view
        ListView listView =
                (ListView)findViewById(
                        R.id.list);

        listView.setAdapter(adapter);


    }
}

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

        ArrayList<Color> colors = new ArrayList<Color>();

        colors.add( new Color("red","weṭeṭṭi"));
        colors.add( new Color("green","chokokki"));
        colors.add( new Color("brown","akaakki"));
        colors.add( new Color("gray","topoppi"));
        colors.add( new Color("black","kululli"));
        colors.add( new Color("white","kelelli"));
        colors.add( new Color("dusty yellow","ṭopiisә"));
        colors.add( new Color("mustard yellow","chiwiiṭә"));

        ColorAdapter adapter = new ColorAdapter(
                this, colors);

        // for list view
        ListView listView =
                (ListView)findViewById(
                        R.id.list);

        listView.setAdapter(adapter);


    }
}

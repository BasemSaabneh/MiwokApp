package com.example.android.miwokapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);


        ArrayList<Word> phases = new ArrayList<Word>();

        phases.add( new Word("Where are you going?","minto wuksus"));
        phases.add( new Word("What is your name?","tinnә oyaase'nә"));
        phases.add( new Word("My name is...","oyaaset..."));
        phases.add( new Word("How are you feeling?","michәksәs?"));
        phases.add( new Word("I’m feeling good.","kuchi achit"));
        phases.add( new Word("Are you coming?","әәnәs'aa?"));
        phases.add( new Word("Yes, I’m coming.","hәә’ әәnәm"));
        phases.add( new Word("I’m coming.","әәnәm"));
        phases.add( new Word("Let’s go.","yoowutis"));
        phases.add( new Word("Come here.","әnni'nem"));

        WordAdapter adapter = new WordAdapter(
                this, phases,R.color.category_phrases);

        // for list view
        ListView listView =
                (ListView)findViewById(
                        R.id.list);

        listView.setAdapter(adapter);





    }


}

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


        ArrayList<Phases> phases = new ArrayList<Phases>();

        phases.add( new Phases("Where are you going?","minto wuksus"));
        phases.add( new Phases("What is your name?","tinnә oyaase'nә"));
        phases.add( new Phases("My name is...","oyaaset..."));
        phases.add( new Phases("How are you feeling?","michәksәs?"));
        phases.add( new Phases("I’m feeling good.","kuchi achit"));
        phases.add( new Phases("Are you coming?","әәnәs'aa?"));
        phases.add( new Phases("Yes, I’m coming.","hәә’ әәnәm"));
        phases.add( new Phases("I’m coming.","әәnәm"));
        phases.add( new Phases("Let’s go.","yoowutis"));
        phases.add( new Phases("Come here.","әnni'nem"));

        PhasesAdapter adapter = new PhasesAdapter(
                this, phases);

        // for list view
        ListView listView =
                (ListView)findViewById(
                        R.id.list);

        listView.setAdapter(adapter);





    }


}

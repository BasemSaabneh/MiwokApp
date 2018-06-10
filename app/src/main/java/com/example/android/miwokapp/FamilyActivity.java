package com.example.android.miwokapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> families = new ArrayList<Word>();

        families.add( new Word("father","әpә", R.drawable.family_father));
        families.add( new Word("mother","әṭa", R.drawable.family_mother));
        families.add( new Word("son","angsi", R.drawable.family_son));
        families.add( new Word("daughter","tune", R.drawable.family_daughter));
        families.add( new Word("older brother","taachi", R.drawable.family_older_brother));
        families.add( new Word("younger brother","chalitti", R.drawable.family_younger_brother));
        families.add( new Word("older sister","teṭe", R.drawable.family_older_sister));
        families.add( new Word("younger sister","kolliti", R.drawable.family_younger_sister));
        families.add( new Word("grandmother","ama", R.drawable.family_grandmother));
        families.add( new Word("grandfather","paapa", R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(
                this, families,R.color.category_family);

        // for list view
        ListView listView =
                (ListView)findViewById(
                        R.id.list);

        listView.setAdapter(adapter);




    }
}

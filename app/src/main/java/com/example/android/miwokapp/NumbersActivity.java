package com.example.android.miwokapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add( new Word("one","lutti"));
        words.add( new Word("two","otiiko"));
        words.add( new Word("three","tolookosu"));
        words.add( new Word("four","oyyisa"));
        words.add( new Word("five","massokka"));
        words.add( new Word("six","temmokka"));
        words.add( new Word("seven","kenekaku"));
        words.add( new Word("eight","kawinta"));
        words.add( new Word("nine","wo'e"));
        words.add( new Word("ten","ma'aacha"));


        WordAdapter adapter = new WordAdapter(
                        this, words);

        // for list view
        ListView listView =
                (ListView)findViewById(
                        R.id.list);
        listView.setAdapter(adapter);




    }//onCreate




    private void usingArray() {
        //        // Create an array of words
//        String[] words = new String[10];
//        words[0] = "one";
//        words[1] = "two";
//        words[2] = "three";
//        words[3] = "four";
//        words[4] = "five";
//        words[5] = "six";
//        words[6] = "seven";
//        words[7] = "eight";
//        words[8] = "nine";
//        words[9] = "ten";

        //String words [] = new String [] {"one","two","three","four","five","six","seven","eight","nine","ten"};
        //String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
//
//        ArrayList<String> words = new ArrayList<String>();
//        words.add("one");
//        words.add("two");
//        words.add("three");
//        words.add("four");
//        words.add("five");
//        words.add("six");
//        words.add("seven");
//        words.add("eight");
//        words.add("nine");
//        words.add("ten");
//
//        LinearLayout rootView=
//                (LinearLayout)findViewById(R.id.rootView);
//
//
//        int index =0;
//        while (index < words.size()){
//            TextView wordsView = new TextView(this);
//            wordsView.setText(String.valueOf(words.get(index)));
//            rootView.addView(wordsView);
//            index ++;
//        }

//        for (int i =0;i< words.size();i++){
//            TextView wordsView = new TextView(this);
//            wordsView.setText(String.valueOf(words.get(i)));
//            rootView.addView(wordsView);
//        }

    }
}

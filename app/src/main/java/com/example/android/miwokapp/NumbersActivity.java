package com.example.android.miwokapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add( new Word("one","lutti",R.drawable.number_one));
        words.add( new Word("two","otiiko",R.drawable.number_two));
        words.add( new Word("three","tolookosu",R.drawable.number_three));
        words.add( new Word("four","oyyisa",R.drawable.number_four));
        words.add( new Word("five","massokka",R.drawable.number_five));
        words.add( new Word("six","temmokka",R.drawable.number_six));
        words.add( new Word("seven","kenekaku",R.drawable.number_seven));
        words.add( new Word("eight","kawinta",R.drawable.number_eight));
        words.add( new Word("nine","wo'e",R.drawable.number_nine));
        words.add( new Word("ten","ma'aacha",R.drawable.number_ten));


        WordAdapter adapter = new WordAdapter(
                        this, words,R.color.category_numbers);

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

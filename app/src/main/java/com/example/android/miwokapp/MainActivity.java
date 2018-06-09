package com.example.android.miwokapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView numbers,family,colors,phrases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        numbers= (TextView) findViewById(R.id.numbers);
        family= (TextView) findViewById(R.id.family);
        colors= (TextView) findViewById(R.id.colors);
        phrases= (TextView) findViewById(R.id.phrases);


        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open The List of Numbers", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), NumbersActivity.class);
                startActivity(intent);
            }
        });

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open The List of family", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), FamilyActivity.class);
                startActivity(intent);
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open The List of colors", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), ColorsActivity.class);
                startActivity(intent);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Open The List of phrases", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), PhrasesActivity.class);
                startActivity(intent);
            }
        });
    }//Main

    public void openNumbersList(View view) {
//        Intent intent = new Intent(this, NumbersActivity.class);
//        startActivity(intent);
    }

}

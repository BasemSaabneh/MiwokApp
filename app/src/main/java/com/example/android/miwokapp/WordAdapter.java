package com.example.android.miwokapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, ArrayList<Word> words) {
        super(context,0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.word_list, parent, false);
        }

        Word word=getItem(position);
        TextView defaultTextView =(TextView)listItemView.findViewById(R.id.default_text_view);
        TextView miwokTextView =(TextView)listItemView.findViewById(R.id.miwok_text_view);

        defaultTextView.setText(word.getmDefaultTranslation().toString());
        miwokTextView.setText(word.getmMiwokTranslation().toString());
        return listItemView;

    }

}

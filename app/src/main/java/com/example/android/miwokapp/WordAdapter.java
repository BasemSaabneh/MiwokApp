package com.example.android.miwokapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    //    Resource is for the background color
    private int mColorResourceId;

    public WordAdapter(@NonNull Context context, ArrayList<Word> words,int mColorResourceId) {
        super(context,0, words);
        this.mColorResourceId=mColorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word word =getItem(position);
        TextView defaultTextView =(TextView)listItemView.findViewById(R.id.default_text_view);
        TextView miwokTextView =(TextView)listItemView.findViewById(R.id.miwok_text_view);
        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);

        defaultTextView.setText(word.getmDefault().toString());
        miwokTextView.setText(word.getmMiwok().toString());
        if(word.hasImage()){
            imageView.setImageResource(word.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color= ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;

    }

}

package com.example.android.miwokapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends ArrayAdapter<Color> {

    public ColorAdapter(@NonNull Context context, ArrayList<Color> colors) {
        super(context,0, colors);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.color_list, parent, false);
        }

        Color color=getItem(position);
        TextView defaultTextView =(TextView)listItemView.findViewById(R.id.defaultColor_text_view);
        TextView miwokTextView =(TextView)listItemView.findViewById(R.id.miwokColor_text_view);

        defaultTextView.setText(color.getmDefaultColor().toString());
        miwokTextView.setText(color.getmMiwokColor().toString());
        return listItemView;

    }

}

package com.example.android.miwokapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FamilyAdapter extends ArrayAdapter<Family> {

    public FamilyAdapter(@NonNull Context context, ArrayList<Family> families) {
        super(context,0, families);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.family_list, parent, false);
        }

        Family family=getItem(position);
        TextView defaultTextView =(TextView)listItemView.findViewById(R.id.defaultFamily_text_view);
        TextView miwokTextView =(TextView)listItemView.findViewById(R.id.miwokFamily_text_view);

        defaultTextView.setText(family.getmDefaultFamily().toString());
        miwokTextView.setText(family.getmMiwokFamily().toString());
        return listItemView;

    }

}

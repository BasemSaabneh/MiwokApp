package com.example.android.miwokapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PhasesAdapter extends ArrayAdapter<Phases> {

    public PhasesAdapter(@NonNull Context context, ArrayList<Phases> phases) {
        super(context,0, phases);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.phrases_list, parent, false);
        }

        Phases phases=getItem(position);
        TextView defaultTextView =(TextView)listItemView.findViewById(R.id.defaultPhases_text_view);
        TextView miwokTextView =(TextView)listItemView.findViewById(R.id.miwokPhases_text_view);

        defaultTextView.setText(phases.getmDefaultPhases().toString());
        miwokTextView.setText(phases.getmMiwokPhases().toString());
        return listItemView;

    }

}

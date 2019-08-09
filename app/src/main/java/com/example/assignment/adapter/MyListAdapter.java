package com.example.assignment.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter extends ArrayAdapter<String> {

    private Context mContext;

    private String note;

    public MyListAdapter(Context context, int resource, ArrayList<String> notesList) {
        super(context, resource, notesList);

        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        note = getItem(position);

        if(convertView == null)
        {

        }
        else
        {

        }



        return super.getView(position, convertView, parent);
    }

    private static class MyViewHolder{
        TextView notesDesc;
        ImageView addAlarmImg;
    }
}

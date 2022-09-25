package com.example.perfectlist;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class ShowTaskExpandableListAdapter extends BaseExpandableListAdapter
{
    //Initialize variable
    ArrayList<String> category_list;
    HashMap<String, ArrayList<String>> task_per_category_list;

    //Create constructor
    public ShowTaskExpandableListAdapter(ArrayList<String> category_list,
                                         HashMap<String, ArrayList<String>> task_per_category_list)
    {
        this.category_list = category_list;
        this.task_per_category_list = task_per_category_list;
    }

    @Override
    public int getGroupCount()
    {
        return category_list.size();
    }

    @Override
    public int getChildrenCount(int category_index)
    {
        return task_per_category_list.get(category_list.get(category_index)).size();
    }

    @Override
    public Object getGroup(int category_index)
    {
        return category_list.get(category_index);
    }

    @Override
    public Object getChild(int category_index, int task_index)
    {
        return task_per_category_list.get(category_list.get(category_index)).get(task_index);
    }

    @Override
    public long getGroupId(int i)
    {
        return 0;
    }

    @Override
    public long getChildId(int i, int i1)
    {
        return 0;
    }

    @Override
    public boolean hasStableIds()
    {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup)
    {
        //Initialize view
        view = LayoutInflater.from(viewGroup.getContext()).inflate(
            android.R.layout.simple_expandable_list_item_1,
            viewGroup,
            false);

        //Initialize and assign variable
        TextView text_view = view.findViewById(android.R.id.text1);

        //Initialize string
        String s_group = String.valueOf(getGroup(i));

        //Set text on text view
        text_view.setText(s_group);

        //Set text style bold
        text_view.setTypeface(null, Typeface.BOLD);

        //Set text color
        text_view.setTextColor(Color.BLUE);

        //Return view
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup)
    {
        //Initialize view
        view = LayoutInflater.from(viewGroup.getContext()).inflate(
            android.R.layout.simple_selectable_list_item,
            viewGroup,
            false);

        //Initialize and assign variable
        TextView text_view = view.findViewById(android.R.id.text1);

        //Initialize string
        String s_child = String.valueOf(getChild(i, i1));

        //Set text on text view
        text_view.setText(s_child);

        //Set on click listener
        text_view.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //Display toast
                Toast.makeText(viewGroup.getContext(), s_child, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1)
    {
        return false;
    }
}

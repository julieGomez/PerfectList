package com.example.perfectlist;

import android.os.Bundle;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class ShowTaskActivity extends AppCompatActivity
{
    ExpandableListView elv_category_task;
    ArrayList<String> category_list = new ArrayList<>();
    HashMap<String, ArrayList<String>> task_per_category_list = new HashMap<>();
    ShowTaskExpandableListAdapter adapter;
    int category_size = 10;
    int task_size = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_task);

        //Assign variable
        elv_category_task = findViewById(R.id.elv_category_task);

        for(int category_id=0 ; category_id<category_size ; category_id++)
        {
            //Add values in category list
            category_list.add("Categorie " + (category_id+1));

            //Initialize array list
            ArrayList<String> task_list = new ArrayList<>();

            for(int task_id=0 ; task_id<task_size ; task_id++)
            {
                //Add values in array list
                task_list.add("Tâche " + (task_id+1));
            }

            //Put values in child list
            task_per_category_list.put(category_list.get(category_id), task_list);
        }

        //Initialize adapter
        adapter = new ShowTaskExpandableListAdapter(category_list, task_per_category_list);

        //Set adapter
        elv_category_task.setAdapter(adapter);
    }
}

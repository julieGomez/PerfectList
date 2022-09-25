package com.example.perfectlist;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Intent intent_createTaskActivity = new Intent(this, CreateTaskActivity.class);
        Intent intent_show_task_activity = new Intent(this, ShowTaskActivity.class);
        //startActivity(intent_createTaskActivity);
        startActivity(intent_show_task_activity);
    }
}
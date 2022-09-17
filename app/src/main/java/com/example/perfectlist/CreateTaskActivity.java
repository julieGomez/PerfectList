package com.example.perfectlist;

import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class CreateTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_task);

        //Change text when switch_isNotificationNeeded is checked or not
        Switch switch_isNotificationNeeded = findViewById(R.id.switch_isNotificationNeeded);
        switch_isNotificationNeeded.setOnCheckedChangeListener((button, isChecked) -> {
            if(isChecked)
            {
                int stringId = getResources().getIdentifier("yes", "string", getPackageName());
                String yes = getString(stringId);
                switch_isNotificationNeeded.setText(yes);
            }
            else
            {
                int stringId = getResources().getIdentifier("no", "string", getPackageName());
                String no = getString(stringId);
                switch_isNotificationNeeded.setText(no);
            }
        });


        //Change text when switch_isNotificationNeeded is checked or not
        Switch switch_endNotification = findViewById(R.id.switch_endNotification);
        switch_endNotification.setOnCheckedChangeListener((button, isChecked) -> {
            if(isChecked)
            {
                int stringId = getResources().getIdentifier("yes", "string", getPackageName());
                String yes = getString(stringId);
                switch_endNotification.setText(yes);
            }
            else
            {
                int stringId = getResources().getIdentifier("no", "string", getPackageName());
                String no = getString(stringId);
                switch_endNotification.setText(no);
            }
        });
    }
}
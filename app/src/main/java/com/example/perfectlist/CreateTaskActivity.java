package com.example.perfectlist;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Calendar;

public class CreateTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_task);

        //Change text when switch_isNotificationNeeded is checked or not.
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

        //Change text when switch_isNotificationNeeded is checked or not.
        Switch switch_endNotification = findViewById(R.id.switch_endNotification);
        switch_endNotification.setOnCheckedChangeListener((button, isChecked) -> {
            if(isChecked)
            {
                int stringId = getResources().getIdentifier("yes", "string", getPackageName());
                String yes = getString(stringId);
                switch_endNotification.setText(yes);

                //Create Calendar instance.
                Calendar calendar = Calendar.getInstance();
                final int day = calendar.get(Calendar.DAY_OF_MONTH);
                final int month = calendar.get(Calendar.MONTH);
                final int year = calendar.get(Calendar.YEAR);

                //Select the final date of the current task notification.
                TextView tv_endNotificationDate = findViewById(R.id.tv_endNotificationDate);
                tv_endNotificationDate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        DatePickerDialog datePickerDialog = new DatePickerDialog(CreateTaskActivity.this, new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                                String date = dayOfMonth + "/" + (month+1) + "/" + year;
                                tv_endNotificationDate.setText(date);
                            }
                        }, year, month, day);
                        datePickerDialog.show();
                    }
                });
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
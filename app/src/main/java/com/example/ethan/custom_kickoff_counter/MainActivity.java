package com.example.ethan.custom_kickoff_counter;

import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static int timeUntilKickoff(Calendar currentDate, Calendar kickoffDate) {

    }

    public Calendar setKickoffDate() {

    }

    public Calendar getCurrentDate() {
        Calendar currentDate = new Calendar.getInstance();
        return currentDate;
    }
}

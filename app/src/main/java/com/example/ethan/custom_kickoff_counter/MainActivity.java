package com.example.ethan.custom_kickoff_counter;

import android.icu.text.SimpleDateFormat;
<<<<<<< HEAD
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.ParseException;
import java.util.Date;
=======
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
>>>>>>> 0e02dcb5ac0317991a738653357885a880244e0b

public class MainActivity extends AppCompatActivity {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

<<<<<<< HEAD
    public CountDownTimer calculateCountdown() {
        Date kickoffDate = null, currentDate = new Date();
        try {
            kickoffDate = sdf.parse("2017/01/07 10:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //getTime() converts from "Date" to "long
        CountDownTimer cdt = new CountDownTimer(kickoffDate.getTime() - currentDate.getTime(), 1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {

            }
        }.start();
        return cdt;
=======
    public static int timeUntilKickoff(Calendar currentDate, Calendar kickoffDate) {

    }

    public Calendar setKickoffDate() {

    }

    public Calendar getCurrentDate() {
        Calendar currentDate = new Calendar.getInstance();
        return currentDate;
>>>>>>> 0e02dcb5ac0317991a738653357885a880244e0b
    }
}

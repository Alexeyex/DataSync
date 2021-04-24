package com.example.datasyncchermyanin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MorningActivity extends AppCompatActivity {

    private TextView morningTime;
    private SimpleDateFormat formatForDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);
        formatForDate = new SimpleDateFormat("HH:mm:ss");
        morningTime = findViewById(R.id.morningTime);

        Date dateMorning = new Date();

        morningTime.setText(formatForDate.format(dateMorning));

    }
}
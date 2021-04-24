package com.example.datasyncchermyanin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EveningActivity extends AppCompatActivity {
    private TextView eveningTime;
    public SimpleDateFormat formatForDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);

        formatForDate = new SimpleDateFormat("HH:mm:ss");
        Date dateEvening = new Date();

        eveningTime = findViewById(R.id.eveningTime);
        eveningTime.setText(formatForDate.format(dateEvening));
    }
}
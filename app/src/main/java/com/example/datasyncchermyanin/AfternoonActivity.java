package com.example.datasyncchermyanin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AfternoonActivity extends AppCompatActivity {
    private TextView afternoonTime;
    private SimpleDateFormat formatForDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afternoon);

        formatForDate = new SimpleDateFormat("HH:mm:ss");
        afternoonTime = findViewById(R.id.afternoonTime);

        Date dateAfternoon = new Date();

        afternoonTime.setText(formatForDate.format(dateAfternoon));
    }
}
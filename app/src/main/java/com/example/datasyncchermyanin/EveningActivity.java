package com.example.datasyncchermyanin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EveningActivity extends AppCompatActivity {
    private TextView e;
    private SimpleDateFormat formatForDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);

        formatForDate = new SimpleDateFormat("HH:mm:ss");
        e.findViewById(R.id.e);

        Date dateE = new Date();

        e.setText(formatForDate.format(dateE));
    }
}
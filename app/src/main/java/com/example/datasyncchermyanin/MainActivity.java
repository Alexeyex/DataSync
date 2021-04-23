package com.example.datasyncchermyanin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private Button syncBtn;
    private SimpleDateFormat formatForDate;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        syncBtn = findViewById(R.id.syncBtn);
        res = findViewById(R.id.res);
        formatForDate = new SimpleDateFormat("HH", Locale.getDefault());
        int time = Integer.parseInt(formatForDate.format(Calendar.getInstance().getTime()));

        syncBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SYNC);
                    if (time >= 6 && time < 14) {
                        intent.setData(Uri.parse("http://morning"));
                    } else if (time >= 14 && time < 15) {
                        intent.setData(Uri.parse("http://afternoon"));
                    } else {
                        intent.setData(Uri.parse("http://evening"));
                    }
            }
        });
    }
}
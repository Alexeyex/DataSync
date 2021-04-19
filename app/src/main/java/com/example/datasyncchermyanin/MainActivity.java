package com.example.datasyncchermyanin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
        formatForDate = new SimpleDateFormat("HH:mm:ss");

        syncBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SYNC);
                Date date = new Date();
                try {
                    Date d1 = formatForDate.parse("06:00:00");
                    Calendar calendar1 = Calendar.getInstance();
                    calendar1.setTime(d1);
                    Date d2 = formatForDate.parse("14:00:00");
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(d2);
                    Date d3 = formatForDate.parse("19:00:00");
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTime(d3);
                    if (calendar2.after(date) && calendar1.before(date)) {
                        intent.setData(Uri.parse("http://morning"));
                        startActivity(intent);
                    }
                    if (calendar1.after(date) && calendar3.before(date)) {
                        intent.setData(Uri.parse("http://afternoon"));
                        startActivity(intent);
                    }
                    if (calendar3.after(date) && calendar1.before(date)) {
                        intent.setData(Uri.parse("http://evening"));
                        startActivity(intent);
                    }

                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
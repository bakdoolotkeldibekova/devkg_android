package com.example.devkg.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.devkg.R;

public class VacancyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vacancy_activity);

        TextView nameTxt = findViewById(R.id.nameTxt);
        String name = "Name not set";

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            name = extras.getString("vacancyName");
        }

        nameTxt.setText(name);
    }
}

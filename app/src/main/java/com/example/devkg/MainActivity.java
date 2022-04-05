package com.example.devkg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.devkg.activity.VacancyActivity;
import com.example.devkg.adapter.VacancyAdapter;
import com.example.devkg.model.Vacancy;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Vacancy> vacancies = new ArrayList<Vacancy>();
    private RecyclerView recyclerView;
    private VacancyAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);
        setInitialData();
        setAdapter();

        Button btn = (Button)findViewById(R.id.mainMenu);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.smoothScrollToPosition(0);
            }
        });

        Button btn1 = (Button)findViewById(R.id.favoriteMenu);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VacancyActivity.class));
            }
        });
    }

    private void setAdapter(){
        setOnClickListener();
        // создаем адаптер
        VacancyAdapter adapter = new VacancyAdapter(this, vacancies, listener);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
         listener = new VacancyAdapter.RecyclerViewClickListener() {
             @Override
             public void onClick(View v, int position) {
                 Intent intent = new Intent(getApplicationContext(), VacancyActivity.class);
                 intent.putExtra("vacancyName", vacancies.get(position).getName());
                 startActivity(intent);
             }
         };
    }

    private void setInitialData(){

        vacancies.add(new Vacancy("Java developer", "DemirBank", R.drawable.image));
        vacancies.add(new Vacancy("Python developer", "АУП-Компани", R.drawable.image));
        vacancies.add(new Vacancy("Frontend JavaScript (ReactJS)", "Argenta", R.drawable.image));
        vacancies.add(new Vacancy("Middle\\Senior Full-Stack Developer (React+Node.js)", "Ptolemay LLC", R.drawable.image));
        vacancies.add(new Vacancy("Middle\\Senior Angular Developer", "MadDevs", R.drawable.image));
        vacancies.add(new Vacancy("Senior IOS developer (Swift)", "CodifyLab", R.drawable.image));
        vacancies.add(new Vacancy("Product Engineer, Start-up, Remote, (Java, Flutter & AWS)", "GIG-A", R.drawable.image));
        vacancies.add(new Vacancy("Flutter Developer", "Zensoft", R.drawable.image));
        vacancies.add(new Vacancy("Java developer", "DemirBank", R.drawable.image));
        vacancies.add(new Vacancy("Python developer\", \"АУП-Компани\", R.drawable.image));\n" +
                "        vacancies.add(new Vacancy(\"Frontend JavaScript (ReactJS)\", \"Argenta\", R.drawable.image));\n" +
                "        vacancies.add(new Vacancy(\"Middle\\\\Senior Full-Stack Developer (React+Node.js)\", \"Ptolemay LLC\", R.drawable.image));\n" +
                "        vacancies.add(new Vacancy(\"Middle\\\\Senior Angular Developer\", \"MadDevs\", R.drawable.image));\n" +
                "        vacancies.add(new Vacancy(\"Senior IOS developer (Swift)\", \"CodifyLab\", R.drawable.image));\n" +
                "        vacancies.add(new Vacancy(\"Product Engineer, Start-up, Remote, (Java, Flutter & AWS)", "GIG-A", R.drawable.image));
        vacancies.add(new Vacancy("Flutter Developer", "Zensoft", R.drawable.image));
        vacancies.add(new Vacancy("Java developer", "DemirBank", R.drawable.image));
        vacancies.add(new Vacancy("Python developer", "АУП-Компани", R.drawable.image));
        vacancies.add(new Vacancy("Frontend JavaScript (ReactJS)", "Argenta", R.drawable.image));
        vacancies.add(new Vacancy("Middle\\Senior Full-Stack Developer (React+Node.js)", "Ptolemay LLC", R.drawable.image));
        vacancies.add(new Vacancy("Middle\\Senior Angular Developer", "MadDevs", R.drawable.image));
        vacancies.add(new Vacancy("Senior IOS developer (Swift)", "CodifyLab", R.drawable.image));
        vacancies.add(new Vacancy("Product Engineer, Start-up, Remote, (Java, Flutter & AWS)", "GIG-A", R.drawable.image));
        vacancies.add(new Vacancy("Flutter Developer", "Zensoft", R.drawable.image));
        vacancies.add(new Vacancy("Java developer", "DemirBank", R.drawable.image));
        vacancies.add(new Vacancy("Python developer", "АУП-Компани", R.drawable.image));
        vacancies.add(new Vacancy("Frontend JavaScript (ReactJS)", "Argenta", R.drawable.image));
        vacancies.add(new Vacancy("Middle\\Senior Full-Stack Developer (React+Node.js)", "Ptolemay LLC", R.drawable.image));
        vacancies.add(new Vacancy("Middle\\Senior Angular Developer", "MadDevs", R.drawable.image));
        vacancies.add(new Vacancy("Senior IOS developer (Swift)", "CodifyLab", R.drawable.image));
        vacancies.add(new Vacancy("Product Engineer, Start-up, Remote, (Java, Flutter & AWS)", "GIG-A", R.drawable.image));
        vacancies.add(new Vacancy("Flutter Developer", "Zensoft", R.drawable.image));




    }
}
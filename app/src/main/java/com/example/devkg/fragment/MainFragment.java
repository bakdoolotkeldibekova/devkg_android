package com.example.devkg.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.devkg.R;
import com.example.devkg.activity.VacancyActivity;
import com.example.devkg.adapter.PackageViewAdapter;
import com.example.devkg.adapter.VacancyAdapter;
import com.example.devkg.model.Vacancy;
import com.google.android.material.appbar.MaterialToolbar;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private Context context;
    private RecyclerView recyclerView;
    private ArrayList<Vacancy> vacancies = new ArrayList<>();
    private PackageViewAdapter packageViewAdapter;
    private VacancyAdapter.RecyclerViewClickListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.context = getContext();

        recyclerView = view.findViewById(R.id.list);
        setInitialData();
        packageViewAdapter = new PackageViewAdapter(context, vacancies);
        recyclerView.setAdapter(packageViewAdapter);
        setAdapter();

        Button btn = view.findViewById(R.id.mainMenu);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.smoothScrollToPosition(0);
            }
        });

    }

    private void setAdapter(){
        setOnClickListener();
        VacancyAdapter adapter = new VacancyAdapter(this.context, vacancies, listener);
        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
         listener = new VacancyAdapter.RecyclerViewClickListener() {
             @Override
             public void onClick(View v, int position) {
                 Intent intent = new Intent(getContext().getApplicationContext(), VacancyActivity.class);
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
        vacancies.add(new Vacancy("Python developer", "АУП-Компани", R.drawable.image));
        vacancies.add(new Vacancy("Frontend JavaScript (ReactJS)", "Argenta", R.drawable.image));
        vacancies.add(new Vacancy("Middle\\Senior Full-Stack Developer (React+Node.js)", "Ptolemay LLC", R.drawable.image));
        vacancies.add(new Vacancy("Middle\\Senior Angular Developer", "MadDevs", R.drawable.image));
        vacancies.add(new Vacancy("Senior IOS developer (Swift)", "CodifyLab", R.drawable.image));
        vacancies.add(new Vacancy("Product Engineer, Start-up, Remote, (Java, Flutter & AWS)", "GIG-A", R.drawable.image));vacancies.add(new Vacancy("Flutter Developer", "Zensoft", R.drawable.image));
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

package com.example.devkg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.devkg.adapter.StateAdapter;
import com.example.devkg.model.State;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData(){

        states.add(new State ("Бразилия", "Бразилиа", R.drawable.image));
        states.add(new State ("Аргентина", "Буэнос-Айрес", R.drawable.image));
        states.add(new State ("Колумбия", "Богота", R.drawable.image));
        states.add(new State ("Уругвай", "Монтевидео", R.drawable.image));
        states.add(new State ("Чили", "Сантьяго", R.drawable.image));
        states.add(new State ("Бразилия", "Бразилиа", R.drawable.image));
        states.add(new State ("Аргентина", "Буэнос-Айрес", R.drawable.image));
        states.add(new State ("Колумбия", "Богота", R.drawable.image));
        states.add(new State ("Уругвай", "Монтевидео", R.drawable.image));
        states.add(new State ("Бразилия", "Бразилиа", R.drawable.image));
        states.add(new State ("Аргентина", "Буэнос-Айрес", R.drawable.image));
        states.add(new State ("Колумбия", "Богота", R.drawable.image));
        states.add(new State ("Уругвай", "Монтевидео", R.drawable.image));
        states.add(new State ("Бразилия", "Бразилиа", R.drawable.image));
        states.add(new State ("Аргентина", "Буэнос-Айрес", R.drawable.image));
        states.add(new State ("Колумбия", "Богота", R.drawable.image));
        states.add(new State ("Уругвай", "Монтевидео", R.drawable.image));
        states.add(new State ("Бразилия", "Бразилиа", R.drawable.image));
        states.add(new State ("Аргентина", "Буэнос-Айрес", R.drawable.image));
        states.add(new State ("Колумбия", "Богота", R.drawable.image));
        states.add(new State ("Уругвай", "Монтевидео", R.drawable.image));
        states.add(new State ("Бразилия", "Бразилиа", R.drawable.image));
        states.add(new State ("Аргентина", "Буэнос-Айрес", R.drawable.image));
        states.add(new State ("Колумбия", "Богота", R.drawable.image));
        states.add(new State ("Уругвай", "Монтевидео", R.drawable.image));
        states.add(new State ("Бразилия", "Бразилиа", R.drawable.image));
        states.add(new State ("Аргентина", "Буэнос-Айрес", R.drawable.image));
        states.add(new State ("Колумбия", "Богота", R.drawable.image));
        states.add(new State ("Уругвай", "Монтевидео", R.drawable.image));



    }
}
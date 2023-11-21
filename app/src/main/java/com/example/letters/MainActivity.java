package com.example.letters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<Letter> letterList = new ArrayList<Letter>();

    RecyclerView recyclerView;
    LetterAdapter letterAdapter;

    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        recyclerView = findViewById(R.id.recyclerView_letters);
        letterList.add(new Letter("1", "A"));
        letterList.add(new Letter("2", "Б"));
        letterList.add(new Letter("3", "В"));
        letterList.add(new Letter("4", "Г"));
        letterList.add(new Letter("5", "Д"));
        System.out.println(letterList.get(1).letter);
        letterAdapter = new LetterAdapter(context, letterList);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(letterAdapter);
        //hhhhhhh
    }


}
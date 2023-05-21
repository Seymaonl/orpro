package com.example.movierecommendations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView rv;
    private ArrayList<Categories> categoriesArrayList;
    private CategoriAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        rv = findViewById(R.id.rv);

        toolbar.setTitle("Kategoriler");
        setSupportActionBar(toolbar);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        categoriesArrayList = new ArrayList<>();

        Categories c1 = new Categories(1,"Komedi");
        Categories c2 = new Categories(2,"Bilim Kurgu");
        Categories c3 = new Categories(3,"Romantik/Fantastik");
        Categories c4 = new Categories(4,"Gerilim");

        categoriesArrayList.add(c1);
        categoriesArrayList.add(c2);
        categoriesArrayList.add(c3);
        categoriesArrayList.add(c4);

        adapter = new CategoriAdapter(this,categoriesArrayList);
        rv.setAdapter(adapter);


    }
}
package com.example.movierecommendations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MoviesActivity extends AppCompatActivity {
    private Toolbar toolbar2;
    private RecyclerView moviesRv;
    private ArrayList<Movies> moviesArrayList;
    private MoviesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        toolbar2 = findViewById(R.id.toolbar2);
        moviesRv = findViewById(R.id.moviesRv);

        toolbar2.setTitle("Filmler");
        setSupportActionBar(toolbar2);

        moviesRv.setHasFixedSize(true);
        moviesRv.setLayoutManager(new StaggeredGridLayoutManager(2,
                StaggeredGridLayoutManager.VERTICAL));

        moviesArrayList = new ArrayList<>();
        Movies m1 = new Movies(1,"Hababam Sınıfı",
                1976,"hababam","Komedi","Ertem EĞİLMEZ");
        Movies m2 = new Movies(2,"Aile Arasında",
                2017,"aile_arasinda","Komedi","Ozan AÇIKTAN");
        Movies m3 = new Movies(3,"Üç Ahmak",
                2009,"uc_ahmak","Komedi","Rajkumar HİRANİ");
        Movies m4 = new Movies(4,"Murder Mystery2",
                2023,"murder","Komedi","Jeremy GARELICK");
        Movies m5 = new Movies(5,"Minyonlar2",
                2022,"minyonlar","Komedi","Kyle BALDA");
        Movies m6 = new Movies(6,"Aykut Enişte",
                2019,"aykut_eniste","Komedi","Onur BİLGETAY");


        moviesArrayList.add(m1);
        moviesArrayList.add(m2);
        moviesArrayList.add(m3);
        moviesArrayList.add(m4);
        moviesArrayList.add(m5);
        moviesArrayList.add(m6);

        adapter = new MoviesAdapter(this,moviesArrayList);
        moviesRv.setAdapter(adapter);
    }
}
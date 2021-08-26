package com.example.android1_21;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CountryAdapter countryAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.main_recycler);

        countryAdapter = new CountryAdapter();
        createList();
    }


    private void createList() {
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("IRAQ", "Baghdad", R.drawable.ic_iraq));
        countries.add(new Country("Great Britain", "London", R.drawable.ic_eng));
        countries.add(new Country("South Korea","Seoul",R.drawable.ic_kr));
        countries.add(new Country("China","Beijing",R.drawable.ic_cn));
        countries.add(new Country("Germany","Berlin",R.drawable.ic_de_3x));
        countries.add(new Country("Russia","Moscow",R.drawable.ic_ru));
        countries.add(new Country("Switzerland","Bern",R.drawable.ic_ch));
        countries.add(new Country("Japan","Tokyo",R.drawable.ic_jp));
        countries.add(new Country("Georgia","Tbilisi",R.drawable.ic_ge));
        countries.add(new Country("Canada","Ottawa",R.drawable.ic_ca));
        countries.add(new Country("USA","Washington",R.drawable.ic_us));
        countries.add(new Country("Spain","Madrid",R.drawable.ic_es));
        countries.add(new Country("Czech","Prague",R.drawable.ic_cz));
        countries.add(new Country("Brazil","Brasilia",R.drawable.ic_br));
        countries.add(new Country("Belgium","Brussels",R.drawable.ic_be));
        countryAdapter.setList(countries);
        recyclerView.setAdapter(countryAdapter);
    }
}
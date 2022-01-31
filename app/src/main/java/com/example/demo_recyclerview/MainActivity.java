package com.example.demo_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private static final int LISTA_NUMEROS = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // identificamos
        recyclerView = findViewById(R.id.recycleView);

        // añadimos devider
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        // modo de mostrar , linearlayout, gridLasyout o Staggered
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        // añadimos a recyclerview linearLayout creado
        recyclerView.setLayoutManager(linearLayoutManager);

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(LISTA_NUMEROS);

        recyclerView.setAdapter(recyclerAdapter);


    }
}
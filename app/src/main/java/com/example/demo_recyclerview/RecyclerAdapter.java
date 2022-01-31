package com.example.demo_recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<NumerosViewHolder> {

    private int numerosItems;

    // constructor
    public RecyclerAdapter(int numerosItems) {
        this.numerosItems = numerosItems;
    }

    @NonNull
    @androidx.annotation.NonNull
    @Override
    public NumerosViewHolder onCreateViewHolder(@NonNull @androidx.annotation.NonNull ViewGroup viewGroup, int i) {
        // nos falta declarar context
        Context context = viewGroup.getContext();

        // identificamos donde esta una fila
        int layoutIdParaListItem = R.layout.list_row;

        // declaramos inflator
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        boolean attachToParentRapido = false;

        View view = layoutInflater.inflate(layoutIdParaListItem,viewGroup,attachToParentRapido);

        NumerosViewHolder numerosViewHolder = new NumerosViewHolder(view);


        return numerosViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull @androidx.annotation.NonNull NumerosViewHolder numerosViewHolder, int i) {

        numerosViewHolder.bind(i);
    }

    @Override
    public int getItemCount() {
        return numerosItems;
    }
}

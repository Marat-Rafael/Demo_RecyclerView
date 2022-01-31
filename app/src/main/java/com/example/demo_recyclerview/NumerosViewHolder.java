package com.example.demo_recyclerview;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

/**
 * creamos la clase NumerosViewHolder
 */

public class NumerosViewHolder extends RecyclerView.ViewHolder {

    TextView textViewNumeros;

    // ----------------------------------------CONSTRUCTOR ---------------------------------------------
    public NumerosViewHolder(@NonNull @androidx.annotation.NonNull View itemView) {

        super(itemView);

        textViewNumeros = itemView.findViewById(R.id.texview_numeros);
    }

    void bind(int listaIndex) {
        textViewNumeros.setText(String.valueOf(listaIndex));

    }
}

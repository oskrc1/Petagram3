package com.oscarcruz.Petagram3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;


import java.util.ArrayList;

public class DetalleGato extends AppCompatActivity {


    RecyclerView listaMascotas;
    ArrayList<Gatos> contacto;
    Adapter adaptador;


    public void inicializarAdaptador(){
        GatoAdaptador adaptador = new GatoAdaptador(contacto, this);
        listaMascotas.setAdapter(adaptador);
    }


    public void inicializarFavs(){
        contacto = new ArrayList<Gatos>();

        contacto.add(new Gatos(R.drawable.cat5, "Anubis", 1));
        contacto.add(new Gatos(R.drawable.cat3,"Copito", 1));
        contacto.add(new Gatos(R.drawable.cat2,"Tiger", 1));
        contacto.add(new Gatos(R.drawable.cat1,"Snow", 1));
        contacto.add(new Gatos(R.drawable.cat4, "Sunny", 1));

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_gato);

        Toolbar miActionBar2 = (Toolbar) findViewById(R.id.myRateToolbar);
        setSupportActionBar(miActionBar2);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        listaMascotas = (RecyclerView) findViewById(R.id.rv_ratesCats);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializarFavs();
        inicializarAdaptador();



}}
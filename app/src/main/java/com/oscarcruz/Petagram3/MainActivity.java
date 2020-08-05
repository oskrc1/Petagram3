package com.oscarcruz.Petagram3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Gatos> contactos;
    private RecyclerView listaContactos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        final ImageView star = (ImageView) findViewById(R.id.btnStar);
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Estrella", Toast.LENGTH_LONG).show();

                  Intent intent = new Intent(MainActivity.this, DetalleGato.class);
                  startActivity(intent);

                }


        });

        listaContactos = (RecyclerView) findViewById(R.id.rvContactos);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaContactos.setLayoutManager(llm);
        inicializarlistaContactos();
        inicializarAdaptador();


    }
    public GatoAdaptador adaptador;
    private void inicializarAdaptador(){
        adaptador = new GatoAdaptador(contactos, this);
        listaContactos.setAdapter(adaptador);

    }

    public void inicializarlistaContactos() {
        contactos = new ArrayList<Gatos>();

        contactos.add(new Gatos(R.drawable.cat1,"Snow", 0));
        contactos.add(new Gatos(R.drawable.cat2,"Tiger", 0));
        contactos.add(new Gatos(R.drawable.cat3,"Copito", 0));
        contactos.add(new Gatos(R.drawable.cat4, "Sunny", 0));
        contactos.add(new Gatos(R.drawable.cat5, "Anubis", 0));
        contactos.add(new Gatos(R.drawable.cat6, "Tizón", 0));
        contactos.add(new Gatos(R.drawable.cat7, "Bonnie", 0));
    }



}
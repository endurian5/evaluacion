package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private RecyclerView Lista;
    private RecyclerAdapter adapter;
    private List<ItemList> items;
    String[] datos = {"Profile", "Posts", "Following", "Profile View"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Spinner spin = (Spinner) findViewById(R.id.spinnerProfile);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, datos);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spin.setAdapter(aa);

        initViews();
        initValues();
    }

    private void initViews() {
        Lista = findViewById(R.id.Lista);
    }

    private void initValues() {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        Lista.setLayoutManager(manager);

        items = getItems();
        adapter = new RecyclerAdapter(items);
        Lista.setAdapter(adapter);
    }

    private List<ItemList> getItems() {
        List<ItemList> itemsLists = new ArrayList<>();
        itemsLists.add(new ItemList("Datos curiosos sobre los mapaches", "los mapaches son animales silvestres y nocturnos...", R.drawable.raccoon));
        itemsLists.add(new ItemList("Datos curiosos sobre los Osos Polares", "los osos polares son animales salvajes y se clasifican como mamíferos marinos...", R.drawable.bear));
        itemsLists.add(new ItemList("Datos curiosos sobre los gatos", "los gatos son mamíferos del tipo felino, los cuales tienen una increíble flexibilidad...", R.drawable.cat));
        itemsLists.add(new ItemList("Datos curiosos sobre los lobos", "los lobos son animales salvajes del tipo canino, los cuales conviven en grupos...", R.drawable.wolf));
        itemsLists.add(new ItemList("Datos curiosos sobre los coalas", "los coalas son mamíferos del tipo marsupial, es decir que tienen bolsa para permitir el desarrollo de sus crías...", R.drawable.koala));
        itemsLists.add(new ItemList("Datos curiosos sobre los perros", "los perros son animales mamíferos y cuadrúpedos que fueron domesticados hace unos 10.000 años y que, actualmente, conviven con el hombre como una mascota. Su nombre científico es Canis lupus familiaris...", R.drawable.dog));

        return itemsLists;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button boton_log;
    private Button boton_crear;
    private Button boton_sig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        boton_log = findViewById(R.id.button3);
        boton_crear = findViewById(R.id.button4);
        boton_sig = findViewById(R.id.button3);
    }

    public void buttonLogin(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }


    public void buttonCreateAccount(View view) {
        Intent intent = new Intent(this, createaccount.class);
        startActivity(intent);
    }
}
package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.Button;



public class accountsettings extends AppCompatActivity {
    private Button boton_sett;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);


        boton_sett= findViewById(R.id.button7);

    }

    public void buttonInicio(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
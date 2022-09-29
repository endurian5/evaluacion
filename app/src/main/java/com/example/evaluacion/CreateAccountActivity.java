package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class createaccount extends AppCompatActivity {
    private Button boton_post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        boton_post = findViewById(R.id.button5);
    }

    public void buttonPostcreateaccount(View view) {
        Intent intent = new Intent(this, PostCreateAccoutActivity.class);
        startActivity(intent);
    }
}
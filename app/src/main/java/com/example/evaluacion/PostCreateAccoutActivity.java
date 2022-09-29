package com.example.evaluacion;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PostCreateAccoutActivity extends AppCompatActivity {
    private Button boton_sett;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_create_accout);

        boton_sett= findViewById(R.id.button6);

    }

    public void buttonAccountSettings(View view) {
        Intent intent = new Intent(this, accountsettings.class);
        startActivity(intent);
    }
}
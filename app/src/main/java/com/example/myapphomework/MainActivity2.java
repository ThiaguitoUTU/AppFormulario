package com.example.myapphomework;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView nameDisplay, passwordDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameDisplay = findViewById(R.id.nameDisplay);
        passwordDisplay = findViewById(R.id.passwordDisplay);

        // Obtener el Intent y los datos
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("NAME");
        String contrasena = intent.getStringExtra("PASSWORD");

        // Mostrar los datos en los TextViews
        nameDisplay.setText("Name: " + nombre);
        passwordDisplay.setText("Password: " + contrasena);
    }
}

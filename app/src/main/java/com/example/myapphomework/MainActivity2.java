package com.example.myapphomework;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
        nameDisplay.setText("Bienvenido: " + nombre);
        passwordDisplay.setText("Password: " + contrasena);

        // Encontrar el botón de la cámara en el layout
        Button openCameraButton = findViewById(R.id.openCameraButton);

        // Configurar el onClickListener para el botón de la cámara
        openCameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para abrir la aplicación de la cámara
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                // Verificar si hay alguna aplicación que pueda manejar el Intent
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    // Mostrar un mensaje de error si no hay ninguna aplicación que pueda manejar el Intent
                    Toast.makeText(MainActivity2.this, "No hay ninguna aplicación para manejar la cámara", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

package com.example.myapphomework;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText name, password;
    Button btnlogin;
    String TAG = "Test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        btnlogin = findViewById(R.id.btnlogin);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Log.d(TAG, "Estoy en el onCreate");

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = name.getText().toString();
                String contrasena = password.getText().toString();

                if (nombre.isEmpty() || contrasena.isEmpty()) { // Cierra el paréntesis
                    Toast.makeText(MainActivity.this, "Por favor complete todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "Estoy en el onResume");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "Estoy en el onStart");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "Estoy en el onPause");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(TAG, "Estoy en el onRestart");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Estoy en el onDestroy");
    }
}

package com.example.myapphomework;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String name, TAG= "Test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
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

        Log.d(TAG,  "Estoy en el onStart");
    }
    @Override
    public void onPause() {
        super.onPause();

        Log.d(TAG,  "Estoy en el onPause");
    }
    @Override
    public void onRestart() {
        super.onRestart();

        Log.d(TAG,  "Estoy en el onRestart");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d(TAG,  "Estoy en el onDestroy");
    }



}
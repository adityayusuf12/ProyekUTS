package com.example.proyekuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Dolar(View view) {
        Intent intent = new Intent(this, DolarActivity.class);
        startActivity(intent);

    }

    public void Pound(View view) {
        Intent intent  = new Intent(this, PoundActivity.class);
        startActivity(intent);
    }

    public void Euro(View view) {
        Intent intent = new Intent( this, EuroActivity.class);
        startActivity(intent);
    }

    public void yen(View view) {
        Intent intent = new Intent(this, YenActivity.class);
        startActivity(intent);
    }
}

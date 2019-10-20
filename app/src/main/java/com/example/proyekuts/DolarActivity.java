package com.example.proyekuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class DolarActivity extends AppCompatActivity {
   EditText edit_angka;
   Button convert;
   TextView hasil;

   double angka;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolar);

        edit_angka =  findViewById(R.id.rupiah_inpt);
        convert =  findViewById(R.id.button_convert);
        hasil =  findViewById(R.id.TV_output);




    }

    public void Convert(View view) {

        String getAngka = edit_angka.getText().toString();
        double angs = Double.parseDouble(getAngka);
        double hasildlr = angs * 14150;
        hasil.setText("$" + hasildlr);
    }
}

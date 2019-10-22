package com.example.proyekuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class YenActivity extends AppCompatActivity {
    EditText inpt;
    Button convert;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_yen);
        inpt = findViewById(R.id.yen_inpt);
        convert = findViewById(R.id.button_convert);
        hasil = findViewById(R.id.TV_output);

    }

    public void convert(View view) {
        if (TextUtils.isEmpty(inpt.getText())){
            Toast.makeText(YenActivity. this, "Masukan Angka", Toast.LENGTH_SHORT).show();
        }
        else
        {
            String getInpt = inpt.getText().toString();
            double angka = Double.parseDouble(getInpt);
            double hsl = angka * 130;
            hasil.setText("Rp"+ hsl);
    }


    }
}

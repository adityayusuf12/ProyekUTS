package com.example.proyekuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EuroActivity extends AppCompatActivity {
    EditText inpt;
    TextView hasil;
    Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_euro);

        inpt = findViewById(R.id.euro_inpt);
        hasil = findViewById(R.id.TV_output);
        convert = findViewById(R.id.button_convert);


    }

    public void convert(View view) {
        if (TextUtils.isEmpty(inpt.getText())){
            Toast.makeText(EuroActivity.this, "Masukan Angka",Toast.LENGTH_SHORT).show();
        }
        else {
            String getInpt = inpt.getText().toString();
            double angka = Double.parseDouble(getInpt);
            double hsl = angka *15600;
            hasil.setText("Rp"+hsl);

        }
    }
}

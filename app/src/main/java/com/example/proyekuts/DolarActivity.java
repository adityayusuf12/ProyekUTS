package com.example.proyekuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DolarActivity extends AppCompatActivity {
   EditText edit_angka;
   Button convert;
   TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolar);

        edit_angka =  findViewById(R.id.dolar_inpt);
        convert =  findViewById(R.id.button_convert);
        hasil =  findViewById(R.id.TV_output);

//        convert.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (TextUtils.isEmpty(edit_angka.getText())){
//                    Toast.makeText(DolarActivity.this, "masukkan angka", Toast.LENGTH_SHORT).show();
//                }else{
//                    Convert();
//                }
//            }
//        });

    }

    public void Convert() {

        String getAngka = edit_angka.getText().toString();
        double angka = Double.parseDouble(getAngka);
        double hasildlr = angka * 14150;
        hasil.setText("Rp" + hasildlr);
    }

    public void convert(View view) {
        if (TextUtils.isEmpty(edit_angka.getText())){
                    Toast.makeText(DolarActivity.this, "masukkan angka", Toast.LENGTH_SHORT).show();
                }else{
                    Convert();
                }
    }
}

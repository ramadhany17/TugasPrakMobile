package com.example.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tabung extends AppCompatActivity {

    private TextView tvHasil;
    private EditText etJari;
    private EditText etTinggi;
    private Button btnHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        tvHasil     = findViewById(R.id.tv_tabung_hasil);
        etJari      = findViewById(R.id.et_tabung_jari);
        etTinggi    = findViewById(R.id.et_tabung_tinggi);
        btnHasil    = findViewById(R.id.btn_tabung_hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sJari = etJari.getText().toString();
                    String sTinggi = etTinggi.getText().toString();


                    double jari   =Double.parseDouble(sJari);
                    double tinggi   =Double.parseDouble(sTinggi);

                    double hasil    = 3.14*jari*jari*tinggi;

                    String sHasil=String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

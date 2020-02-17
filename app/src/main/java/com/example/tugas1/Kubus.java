package com.example.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kubus extends AppCompatActivity {

    private TextView tvHasil;
    private EditText etSisi;
    private Button btnHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        tvHasil     = findViewById(R.id.tv_hasil_kubus);
        etSisi   = findViewById(R.id.et_sisi_kubus);
        btnHasil   = findViewById(R.id.btn_hasil_kubus);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sSisi = etSisi.getText().toString();


                    double sisi   =Double.parseDouble(sSisi);

                    double hasil    = sisi*sisi*sisi;

                    String sHasil=String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                }catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

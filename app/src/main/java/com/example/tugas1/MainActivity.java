package com.example.tugas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnKubus;
    private Button btnTabung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKubus   = findViewById(R.id.btn_kubus);
        btnTabung   = findViewById(R.id.btn_tabung);



        btnKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent   = new Intent(MainActivity.this,Kubus.class);
                startActivity(moveIntent);
            }
        });

        btnTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent   = new Intent(MainActivity.this,Tabung.class);
                startActivity(moveIntent);
            }
        });
    }
}

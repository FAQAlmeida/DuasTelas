package com.example.fqa.duastelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    TextView lblValor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        lblValor = (TextView) findViewById(R.id.lblValor);
        Intent intent = getIntent();
        String texto = intent.getStringExtra("Texto");
        lblValor.setText(texto);
    }
}

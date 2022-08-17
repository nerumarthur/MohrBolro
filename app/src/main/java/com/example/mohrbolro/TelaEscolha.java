package com.example.mohrbolro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;

public class TelaEscolha extends AppCompatActivity {
    RadioButton rbV, rbN, rbC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_escolha);
        getSupportActionBar().hide();
        rbC = findViewById(R.id.rbCigarro);
        rbN = findViewById(R.id.rbNarga);
        rbV = findViewById(R.id.rbVape);
    }
}
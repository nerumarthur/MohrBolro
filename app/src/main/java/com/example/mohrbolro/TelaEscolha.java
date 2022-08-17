package com.example.mohrbolro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class TelaEscolha extends AppCompatActivity {
    RadioButton rbV, rbN, rbC;
    int narga = 0, vape = 0, cigarro = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_escolha);
        getSupportActionBar().hide();
        rbC = findViewById(R.id.rbCigarro);
        rbN = findViewById(R.id.rbNarga);
        rbV = findViewById(R.id.rbVape);
    }
     public void clickCont(View view){
        select();
        TelaContador.cigarro = cigarro;
        TelaContador.narga = narga;
        TelaContador.vape = vape;
        Intent i = new Intent(this, TelaContador.class);
        startActivity(i);
     }
     public void select(){
        if(rbC.isChecked()){
            cigarro = 1;
        }
        if(rbV.isChecked()){
            vape = 1;
        }
        if(rbN.isChecked()){
            narga = 1;
        }


     }
}
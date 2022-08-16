package com.example.mohrbolro;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaContador extends AppCompatActivity {
    int contador = 0;
    TextView contaNormal,contaPreoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_contador);
        getSupportActionBar().hide();
        contaNormal = findViewById(R.id.campoAdq);
        contaPreoc = findViewById(R.id.campoPrec);
    }
    public void Click(View view){
        MediaPlayer snd = MediaPlayer.create(this, R.raw.som);
        snd.start();
        if (contador <= 4){
            contador += 1;
            String st = Integer.toString(contador);
            contaNormal.setText(st);
        } else if (contador >= 5){
          contador += 1;
          String sta = Integer.toString(contador);
          contaPreoc.setText(sta);

        }

    }
}
package com.example.mohrbolro;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

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
        retornarDateTime();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void retornarDateTime(){
        int horaAtual = LocalDateTime.now().getHour();



        /*Locale locale = new Locale("pt","BR");
        SimpleDateFormat DiaAtual = new SimpleDateFormat("dd",locale);
        SimpleDateFormat MesAtual = new SimpleDateFormat("mm",locale);
        SimpleDateFormat AnoAtual = new SimpleDateFormat("yyyy",locale);
        SimpleDateFormat Horario = new SimpleDateFormat("HH:mm:ss",locale);
        Date data = new Date();
        hora = Integer.parseInt(Horario.format(data));*/

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
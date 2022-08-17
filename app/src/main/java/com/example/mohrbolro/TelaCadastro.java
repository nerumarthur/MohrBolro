package com.example.mohrbolro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.time.LocalDateTime;

public class TelaCadastro extends AppCompatActivity {
    EditText lg,sn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        getSupportActionBar().hide();
        lg = findViewById(R.id.edtEmCad);
        sn = findViewById(R.id.edtSnCad);
    }
    public void cadastrar(View view){
        try {
            String em = lg.getText().toString();
            String snCad = sn.getText().toString();
            int horaAtual = LocalDateTime.now().getHour();
            Usuario u = new Usuario(em, snCad, horaAtual);
            u.salvar();
        } catch(Exception E){
            Toast.makeText(this, "Verifique os Dados", Toast.LENGTH_LONG).show();
        }

    }
}
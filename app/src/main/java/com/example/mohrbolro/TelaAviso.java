package com.example.mohrbolro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class TelaAviso extends AppCompatActivity {
    RadioButton c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_aviso);
        getSupportActionBar().hide();
        c = findViewById(R.id.radioButton);

    }
    public void clickRd(View view){
        if (c.isChecked()) {
            Intent i = new Intent(this, TelaContador.class);
            startActivity(i);
        }

    }
}
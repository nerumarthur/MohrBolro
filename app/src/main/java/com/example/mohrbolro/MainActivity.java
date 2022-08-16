package com.example.mohrbolro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    EditText email, senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        email = findViewById(R.id.edtEmail);
        senha = findViewById(R.id.edtSenha);

    }

    public void clickCadastrar(View view){
        Intent i = new Intent(this, TelaCadastro.class);
        startActivity(i);

    }
    public void ClickAviso(View view){
        Intent z = new Intent(this, TelaContador.class);
        startActivity(z);


    }
}
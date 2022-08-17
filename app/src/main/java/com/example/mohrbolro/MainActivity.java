package com.example.mohrbolro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

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
    public void mudaTela(){
        Intent i = new Intent(this, TelaAviso.class);
        startActivity(i);

    }
    public void clickSConta(View view){
        Intent i = new Intent(this, TelaCadastro.class);
        startActivity(i);
    }
    public void clickLogin(View view){
        String em = email.getText().toString();
        String sn = senha.getText().toString();
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Usuario");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                boolean aux = false;
                for (DataSnapshot d : snapshot.getChildren()) {
                    if (d.getValue(Usuario.class).getEmail().equals(em) && d.getValue(Usuario.class).getSenha().equals(sn)) {
                        mudaTela();
                        aux = true;
                        break;
                    }
                }
                if (aux == false) {
                    print(em + " não existe ");

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
    public void print(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
    public void clickEgg(View view){
        Intent z = new Intent(this, MohrJack.class);
        startActivity(z);


    }
}
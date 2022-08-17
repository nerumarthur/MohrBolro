package com.example.mohrbolro;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Usuario {
    String email;
    String senha;
    int horaAtual;

    public Usuario(String email, String senha, int horaAtual) {
        this.email = email;
        this.senha = senha;
        this.horaAtual = horaAtual;
    }

    public Usuario() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getHoraAtual() {
        return horaAtual;
    }

    public void setHoraAtual(int horaAtual) {
        this.horaAtual = horaAtual;
    }

    public void salvar(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Usuario").child(email).setValue(this);

    }

}

package com.example.aprenvocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void Registrarse (View view){

        Intent registrar = new Intent(this, registrarse.class);
        startActivity(registrar);
    }
    public void Iniciar (View view){

        Intent entrar = new Intent(this, inicio.class);
        startActivity(entrar);
    }
}
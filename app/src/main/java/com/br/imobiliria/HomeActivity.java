package com.br.imobiliria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }

    public void piscinas(View view){
        startActivity(new Intent(this, PiscinasActivity.class));
    }

    public void adegas(View view){
        startActivity(new Intent(this, AdegaActivity.class));
    }

    public void gramados(View view){
        startActivity(new Intent(this, GramadoActivity2.class));
    }

    public void cinemas(View view){
        startActivity(new Intent(this, CinemaActivity.class));
    }
}
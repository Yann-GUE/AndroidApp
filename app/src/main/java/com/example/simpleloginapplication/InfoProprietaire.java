package com.example.simpleloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoProprietaire extends AppCompatActivity {
    Button buttonInfoProprietaire;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_proprietaire);
        buttonInfoProprietaire = (Button) findViewById(R.id.buttonInfoProprietaire);
        buttonInfoProprietaire.setOnClickListener(SaisieProprietaireListener);
    }

    private View.OnClickListener SaisieProprietaireListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(InfoProprietaire.this,User.class);
            startActivity(intent);
        }
    };
}
package com.example.simpleloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class User extends AppCompatActivity {
    Button Button_Deco;
    Button Button_Vehicule;
    Button Button_Intervention;
    Button Button_Proprietaire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        User();
    }

    void User() {
        Button_Deco = (Button) findViewById(R.id.Button_Deco);
        Button_Deco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User.this, Login.class);
                startActivity(intent);
            }
        });

        Button_Vehicule = (Button) findViewById(R.id.Button_Vehicule);
        Button_Vehicule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(User.this, SaisieVehicule.class);
                startActivity(intent1);
            }
        });

        Button_Intervention = (Button) findViewById(R.id.Button_Intervention);
        Button_Intervention.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(User.this, SaisieIntervention.class);
                startActivity(intent2);
            }
        });

        Button_Proprietaire = (Button) findViewById(R.id.Button_Proprietaire);
        Button_Proprietaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(User.this, SaisieProprietaire.class);
                startActivity(intent3);
            }
        });
    }
}
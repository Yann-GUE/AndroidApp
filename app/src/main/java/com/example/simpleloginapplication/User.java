package com.example.simpleloginapplication;

import androidx.annotation.NonNull;
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
    Button buttonInfoVehicule;
    Button buttonInfoProprietaire;
    Button buttonInfoIntervention;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        Button_Intervention = (Button) findViewById(R.id.Button_Intervention);
        Button_Intervention.setOnClickListener(InterventionListener);
        Button_Vehicule = (Button) findViewById(R.id.Button_Vehicule);
        Button_Vehicule.setOnClickListener(VehiculeListener);
        Button_Proprietaire = (Button) findViewById(R.id.Button_Proprietaire);
        Button_Proprietaire.setOnClickListener(ProprietaireListener);
        Button_Deco = (Button) findViewById(R.id.Button_Deco);
        Button_Deco.setOnClickListener(DecoListener);
        buttonInfoVehicule = (Button) findViewById(R.id.buttonInfoVehicule);
        buttonInfoVehicule.setOnClickListener(InfoVehiculeListener);
        buttonInfoProprietaire = (Button) findViewById(R.id.buttonInfoProprietaire);
        buttonInfoProprietaire.setOnClickListener(InfoProprietaireListener);
        buttonInfoProprietaire = (Button) findViewById(R.id.buttonInfoProprietaire);
        buttonInfoProprietaire.setOnClickListener(InfoProprietaireListener);
        buttonInfoIntervention = (Button) findViewById(R.id.buttonInfoIntervention);
        buttonInfoIntervention.setOnClickListener(InfoInterventionListener);

    }

    private View.OnClickListener InterventionListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent2 = new Intent(User.this, SaisieIntervention.class);
            startActivity(intent2);
        }
    };

    private View.OnClickListener VehiculeListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent1 = new Intent(User.this, SaisieVehicule.class);
            startActivity(intent1);
        }
    };
    private View.OnClickListener ProprietaireListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent3 = new Intent(User.this, SaisieProprietaire.class);
            startActivity(intent3);
        }
    };
    private View.OnClickListener DecoListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent4 = new Intent(User.this, Login.class);
            startActivity(intent4);
        }
    };
    private View.OnClickListener InfoVehiculeListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent5 = new Intent(User.this, InfoVehicule.class);
            startActivity(intent5);
        }
    };
    private View.OnClickListener InfoProprietaireListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent6 = new Intent(User.this, InfoProprietaire.class);
            startActivity(intent6);
        }
    };
    private View.OnClickListener InfoInterventionListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent6 = new Intent(User.this, InfoIntervention.class);
            startActivity(intent6);
        }
    };

}
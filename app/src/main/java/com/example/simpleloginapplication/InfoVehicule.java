package com.example.simpleloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoVehicule extends AppCompatActivity {
    Button buttonSaisieVehicule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_vehicule);
        buttonSaisieVehicule = (Button) findViewById(R.id.buttonSaisieVehicule);
        buttonSaisieVehicule.setOnClickListener(SaisieVehiculeListener);
    }

    private View.OnClickListener SaisieVehiculeListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(InfoVehicule.this,User.class);
            startActivity(intent);
        }
    };
}
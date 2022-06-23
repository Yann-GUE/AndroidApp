package com.example.simpleloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SaisieVehicule extends AppCompatActivity {
    Button backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie_vehicule);
        backbutton = (Button) findViewById(R.id.backbutton);
        backbutton.setOnClickListener(BackListener);
    }
    private View.OnClickListener BackListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent5 = new Intent(SaisieVehicule.this, User.class);
            startActivity(intent5);
        }
    };
}
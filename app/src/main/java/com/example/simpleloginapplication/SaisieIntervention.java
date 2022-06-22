package com.example.simpleloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SaisieIntervention extends AppCompatActivity {
    Button backbutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie_intervention);
        SaisieIntervention();
    }

    void SaisieIntervention(){
        backbutton2 = (Button) findViewById(R.id.backbutton);

        backbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaisieIntervention.this, User.class);
                startActivity(intent);
            }
        });
    }
}
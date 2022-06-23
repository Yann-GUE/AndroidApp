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
        setContentView(R.layout.activity_saisie_intervention);;
        backbutton2 = (Button) findViewById(R.id.backbutton2);
        backbutton2.setOnClickListener(Back2Listener);
    }

    private View.OnClickListener Back2Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent6 = new Intent(SaisieIntervention.this, User.class);
            startActivity(intent6);
        }
    };
}
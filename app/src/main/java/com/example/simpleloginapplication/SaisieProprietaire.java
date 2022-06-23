package com.example.simpleloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SaisieProprietaire extends AppCompatActivity {
    Button backbutton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie_proprietaire);
        backbutton3 = (Button) findViewById(R.id.backbutton3);
        backbutton3.setOnClickListener(Back3Listener);
    }
    private View.OnClickListener Back3Listener = new View.OnClickListener() {

    @Override
    public void onClick(View v) {
        Intent intent7 = new Intent(SaisieProprietaire.this, User.class);
        startActivity(intent7);
    }
};
}
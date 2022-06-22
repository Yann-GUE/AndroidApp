package com.example.simpleloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class User extends AppCompatActivity {
    Button button7;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        User();
    }

    void User() {
        button7 = (Button) findViewById(R.id.button7);

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User.this, Login.class);
                startActivity(intent);
            }
        });

        button4 = (Button) findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(User.this, SaisieVehicule.class);
                startActivity(intent);
            }
        });
    }

}
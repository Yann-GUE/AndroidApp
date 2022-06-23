package com.example.simpleloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText et_username, et_password;
    Button btn_login;
    Button btn_leave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Login();
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(LoginListener);
        btn_leave = (Button) findViewById(R.id.btn_leave);
        btn_leave.setOnClickListener(LeaveListener);

    }

    void Login(){
        et_username = (EditText)findViewById(R.id.et_username);
        et_password = (EditText)findViewById(R.id.et_password);
        btn_login = (Button)findViewById(R.id.btn_login);
        btn_leave = (Button)findViewById(R.id.btn_leave);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_username.getText().toString().equals("admin") && et_password.getText().toString().equals("admin")){
                    Toast.makeText(Login.this, "Nom d'utilisateur et mot de passe correct", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(Login.this,User.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(Login.this, "Nom d'utilisateur et mot de passe correct", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_leave.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                System.exit(0);
            }
        });
    }

    private View.OnClickListener LoginListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Login.this, User.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener LeaveListener = new View.OnClickListener() {

        @Override
        public void onClick(View v){
            System.exit(0);
        }

    };

}
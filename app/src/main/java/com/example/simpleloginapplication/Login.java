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
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(LoginListener);
        btn_leave = (Button) findViewById(R.id.btn_leave);
        btn_leave.setOnClickListener(LeaveListener);

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
        public void onClick(View v) {
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }

    };

}
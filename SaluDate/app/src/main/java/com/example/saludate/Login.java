package com.example.saludate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    Button signbtn;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void LogtoSign(View view){
        intent=new Intent(getApplicationContext(),Singup.class);
        startActivity(intent);
    }
    public void LogtoPass(View view){
        intent=new Intent(getApplicationContext(),Forgot_password.class);
        startActivity(intent);
    }
}
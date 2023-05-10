package com.example.mvc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;

import java.util.regex.Pattern;

public class login extends AppCompatActivity {

    private AppCompatButton login_b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void go3(View v)
    {
        Intent intent = new Intent(this, code.class);
        startActivity(intent);
    }
    private void validateMail (String email){
        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            login_b.setEnabled(true);
            login_b.setBackgroundDrawable(getDrawable(R.drawable.button_fone));
        }
            else{
                login_b.setEnabled(false);
                login_b.setBackgroundDrawable(getDrawable(R.drawable.butto_unact));
            }

        }
    }
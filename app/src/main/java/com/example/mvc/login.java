package com.example.mvc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

import java.util.regex.Pattern;

public class login extends AppCompatActivity {

    private AppCompatButton logina;
    private EditText email;

    private String emailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        logina = findViewById(R.id.login_b);
        logina.setEnabled(false);
        email = findViewById(R.id.loginEmail);

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                emailText = email.getText().toString();
                validateMail(emailText);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }


    public void go3(View v)
    {
        Intent intent = new Intent(this, code.class);
        startActivity(intent);
    }
    private void validateMail (String email){
        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            logina.setEnabled(true);
            logina.setBackgroundDrawable(getDrawable(R.drawable.button_fone));
        }
            else{
                logina.setEnabled(false);
                logina.setBackgroundDrawable(getDrawable(R.drawable.butto_unact));
            }

        }
    }
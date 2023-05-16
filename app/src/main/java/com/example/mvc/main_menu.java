package com.example.mvc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main_menu extends AppCompatActivity {

    AppCompatButton[] kateg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        kateg = new AppCompatButton[12];
        for (int i = 0; i < 12; i++) {
            kateg[i] = findViewById(Resources.getSystem().getIdentifier("button" + (i+1), "id", getPackageName()));
        }

    }
    public void OnClick(View v){
        AppCompatButton btn = (AppCompatButton) v;
        for (AppCompatButton bt : kateg) {
            bt.setBackgroundDrawable(getApplication().getDrawable(R.drawable.butto_unact));
            bt.setTextColor(Color.parseColor("#7E7E9A"));
        }
        btn.setBackgroundDrawable(getApplication().getDrawable(R.drawable.button_fone));
        btn.setTextColor(Color.parseColor("#ffffff"));
    }
}
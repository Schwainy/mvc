package com.example.mvc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class karta extends AppCompatActivity {
    private AppCompatButton butona;
    String[] pol = {"Мужской", "Женский", "Нелюди"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karta);

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,pol);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        EditText edit1 = (EditText) findViewById(R.id.edittext);
        EditText edit2 = (EditText) findViewById(R.id.edittext2);
        EditText edit3 = (EditText) findViewById(R.id.edittext3);
        EditText edit4 = (EditText) findViewById(R.id.edittext4);

        butona = findViewById(R.id.button10);

        final String[] sys = {"","","",""};
        String test = "1111";


        edit1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (edit1.length() == 0) {
                    sys[0] = "0";
                    butona.setBackgroundDrawable(getDrawable(R.drawable.butto_unact));
                } else {


                    sys[0] = "1";
                    String sys_all = sys[0] + sys[1] + sys[2] + sys[3];
                    if (sys_all.equals(test)) {
                        butona.setBackgroundDrawable(getDrawable(R.drawable.button_fone));
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edit2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (edit2.length() == 0) {
                    sys[1] = "0";
                    butona.setBackgroundDrawable(getDrawable(R.drawable.butto_unact));
                } else {


                    sys[1] = "1";
                    String sys_all = sys[0] + sys[1] + sys[2] + sys[3];
                    if (sys_all.equals(test)) {
                        butona.setBackgroundDrawable(getDrawable(R.drawable.button_fone));
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edit3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (edit3.length() == 0) {
                    sys[2] = "0";
                    butona.setBackgroundDrawable(getDrawable(R.drawable.butto_unact));
                } else {


                    sys[2] = "1";
                    String sys_all = sys[0] + sys[1] + sys[2] + sys[3];
                    if (sys_all.equals(test)) {
                        butona.setBackgroundDrawable(getDrawable(R.drawable.button_fone));
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edit4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (edit4.length() == 0) {
                    sys[3] = "0";
                    butona.setBackgroundDrawable(getDrawable(R.drawable.butto_unact));
                } else {


                    sys[3] = "1";
                    String sys_all = sys[0] + sys[1] + sys[2] + sys[3];
                    if (sys_all.equals(test)) {
                        butona.setBackgroundDrawable(getDrawable(R.drawable.button_fone));
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    public void OnClick(View V){
        Intent intent = new Intent(this,main_menu.class);
        startActivity(intent);
    }
}
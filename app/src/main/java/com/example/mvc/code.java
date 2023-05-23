package com.example.mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class code extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        EditText edit1 = (EditText) findViewById(R.id.edit1);
        EditText edit2 = (EditText) findViewById(R.id.edit2);
        EditText edit3 = (EditText) findViewById(R.id.edit3);
        EditText edit4 = (EditText) findViewById(R.id.edit4);
        String test = "1234";
        final String[] s1 = {"","","",""};
        call_timer();

        edit1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (edit1.length()==1) {
                    s1[0] = edit1.getText().toString();
                    edit2.requestFocus();
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
                if (edit2.length()==1){
                    s1[1] = edit2.getText().toString();
                    edit3.requestFocus();
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
                if (edit3.length()==1){
                    s1[2] = edit3.getText().toString();
                    edit4.requestFocus();
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
                if (edit4.length()==1){
                    s1[3]=edit4.getText().toString();

                    String s_all = s1[0]+s1[1]+s1[2]+s1[3];
                    Log.i("string", (String) s_all);
                    if (s_all.equals(test)){
                        Intent intent = new Intent(code.this,password.class);
                        startActivity(intent);
                    } else if (!s_all.equals(test)) {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Камень я дам, Код я не дам",
                                        Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    public void call_timer() {
        TextView time = (TextView) findViewById(R.id.timer);
        Button btn = (Button) findViewById(R.id.button);
        CountDownTimer cdt = new CountDownTimer(60000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                time.setText("Отправить код повторно можно будет через " + millisUntilFinished / 1000 + " секунд");
            }

            @Override
            public void onFinish() {
                time.setVisibility(View.GONE);
                btn.setVisibility(View.VISIBLE);
            }
        }.start();
    }

        public void back(View v){
            Intent bkd = new Intent(this,login.class);
            startActivity(bkd);
        }
        public void OnClick (View v){
            call_timer();
        }
}
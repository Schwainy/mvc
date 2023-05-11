package com.example.mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class password extends AppCompatActivity {

    ImageView circ1;
    ImageView circ2;
    ImageView circ3;
    ImageView circ4;

    Integer sas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        circ1 = (ImageView) findViewById(R.id.circ1);
        circ2 = (ImageView) findViewById(R.id.circ2);
        circ3 = (ImageView) findViewById(R.id.circ3);
        circ4 = (ImageView) findViewById(R.id.circ4);
        sas = 0;
    }
    public void click (View v){
        if (sas==0){
            circ1.setImageResource(R.drawable.krugpoln);
            sas++;
        }
        else if (sas==1) {
            circ2.setImageResource(R.drawable.krugpoln);
            sas++;
        }
        else if (sas==2) {
            circ3.setImageResource(R.drawable.krugpoln);
            sas++;
        }
        else if (sas==3) {
            circ4.setImageResource(R.drawable.krugpoln);
            Intent intent = new Intent(this,karta.class);
            startActivity(intent);

        }

    }

}
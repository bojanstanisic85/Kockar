package com.example.bojanstanisic.kockar;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GlavnaAktivnost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glavna_aktivnost);
    }


    public void generate(View view){

        EditText et = (EditText)findViewById(R.id.editText);
        String opseg = et.getText().toString();
        int intOpseg = Integer.parseInt(opseg);

        //Make Toast
        CharSequence text = "Unesi broj razlicit od 0";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(this, text, duration);


        if(intOpseg == 0) {
            toast.show();
        }
        else {


            Random rnd = new Random();
            int broj = rnd.nextInt(intOpseg+1);
            TextView myText = (TextView) findViewById(R.id.textView);
            String myString = String.valueOf(broj);
            myText.setText(myString);
        }

    }


}



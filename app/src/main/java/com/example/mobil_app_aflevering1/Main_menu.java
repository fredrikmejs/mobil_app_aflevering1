package com.example.mobil_app_aflevering1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main_menu extends AppCompatActivity implements OnClickListener{

private Button button_web, button_number, button_quiz, button_lazy;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

    button_lazy = findViewById(R.id.button_doNoting);
    button_lazy.setOnClickListener(this);

    button_number = findViewById(R.id.aktivitet_2);
    button_number.setText("click on me");
    button_number.setOnClickListener(this);

    button_web = findViewById(R.id.aktivitet_1);
    button_web.setOnClickListener(this);

    button_quiz = findViewById(R.id.button_quiz);
    button_quiz.setOnClickListener(this);
}

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {

        if(v == button_web){
            Intent myIntent = new Intent(v.getContext(), Webpage.class);
            startActivityForResult(myIntent, 0);
        }

        if (v == button_number){
            int num = (int)(Math.random()*6+1);
            button_number.setText("You clicked on me and rolled " + num  );
        }

        if (v == button_quiz){
            Intent myIntent = new Intent(v.getContext(), quiz.class);
            startActivityForResult(myIntent, 0);
        }

        if(v == button_lazy){
            button_lazy.setText("I don't do anything");
        }
    }
}

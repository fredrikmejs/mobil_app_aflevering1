package com.example.mobil_app_aflevering1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class quiz extends AppCompatActivity implements View.OnClickListener {

    private Button button_wrong1, button_wrong2, button_wrong3, button_correct, button_back;

    private TextView text_question, text_wrong, text_correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        text_wrong = findViewById(R.id.text_wrong);
        text_wrong.setVisibility(View.INVISIBLE);

        text_correct = findViewById(R.id.text_correct);
        text_correct.setVisibility(View.INVISIBLE);

        text_question = findViewById(R.id.text_question);

        button_back = findViewById(R.id.button_goBackQuiz);
        button_back.setOnClickListener(this);

        button_wrong1 = findViewById(R.id.button_wrong1);
        button_wrong1.setOnClickListener(this);

        button_wrong2 = findViewById(R.id.button_wrong2);
        button_wrong2.setOnClickListener(this);

        button_wrong3 = findViewById(R.id.button_wrong3);
        button_wrong3.setOnClickListener(this);

        button_correct = findViewById(R.id.button_correct);
        button_correct.setOnClickListener(this);

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {

        if (v == button_correct) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            text_correct.setText("Your Guess 30 is correct! Good job!");
            text_wrong.setVisibility(View.INVISIBLE);
            text_correct.setVisibility(View.VISIBLE);

        button_wrong1.setVisibility(View.INVISIBLE);
        button_wrong2.setVisibility(View.INVISIBLE);
        button_wrong3.setVisibility(View.INVISIBLE);
        text_question.setVisibility(View.INVISIBLE);
        }

        if (v == button_back){
            Intent intent = new Intent();
            setResult(RESULT_OK, intent);
            finish();
        }

        if (v == button_wrong1){
            text_wrong.setText("Your guess is wrong, try again");
            text_wrong.setVisibility(View.VISIBLE);
        }

        if (v == button_wrong2){
            text_wrong.setText("Your guess is wrong, try again");
            text_wrong.setVisibility(View.VISIBLE);
        }

        if (v == button_wrong3){
            text_wrong.setText("Your guess is wrong, try again");
            text_wrong.setVisibility(View.VISIBLE);
        }

    }
}

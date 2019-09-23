package com.example.mobil_app_aflevering1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Webpage extends AppCompatActivity implements View.OnClickListener {
    Button button_goBack, button_goToURL;
    private WebView webView;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_design);

        button_goBack = findViewById(R.id.backToMain);
        button_goBack.setOnClickListener(this);

        button_goToURL = findViewById(R.id.Button_GoToweb);
        button_goToURL.setOnClickListener(this);

        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://google.com");
    }

    @Override
    public void onClick(View v) {

        if (v == button_goBack) {
            Intent intent = new Intent();
            setResult(RESULT_OK, intent);
            finish();
        }

        if (v == button_goToURL) {
            EditText editText = findViewById(R.id.web_page);
            String input = editText.getText().toString();
            webView.loadUrl("https://"+input);
        }
    }
}
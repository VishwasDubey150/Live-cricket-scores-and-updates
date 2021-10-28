package com.example.cricketscores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView =findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.bing.com/search?q=cricket+scores&cvid=a2603f3525cc47f8b956a60afb9057ae&aqs=edge..69i57j0l8.9212j0j4&pglt=2211&FORM=ANAB01&PC=NMTS");
    }
}
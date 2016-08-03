package com.example.binsar.ta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewCeu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_ceu);

        Intent i = getIntent();
        String webUrl = i.getStringExtra("html");

        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.loadUrl("file:///android_asset/"+webUrl);
    }
}

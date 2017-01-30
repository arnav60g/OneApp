package com.example.android.siteinterface;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;

public class DisplayMessageActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }

    public void amazon (View view) {
        Intent intent = new Intent(this, openAmazon.class);
        startActivity(intent);
    }

    public void flipkart (View view) {
        Intent intent = new Intent(this, openFlipkart.class);
        startActivity(intent);
    }

    public void snapdeal (View view) {
        Intent intent = new Intent(this, openSnapdeal.class);
        startActivity(intent);
    }
}

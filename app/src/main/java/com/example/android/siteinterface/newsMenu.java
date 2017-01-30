package com.example.android.siteinterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class newsMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_menu);
    }

    public void bbc (View view) {
        Intent intent = new Intent(this, openBbc.class);
        startActivity(intent);
    }

    public void yahooNews (View view) {
        Intent intent = new Intent(this, openYahooNews.class);
        startActivity(intent);
    }

    public void googleNews (View view) {
        Intent intent = new Intent(this, openGoogleNews.class);
        startActivity(intent);
    }
}

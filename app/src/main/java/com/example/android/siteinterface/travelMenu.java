package com.example.android.siteinterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class travelMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_menu);
    }

    public void makemytrip (View view) {
        Intent intent = new Intent(this, openMakeMyTrip.class);
        startActivity(intent);
    }

    public void trivago (View view) {
        Intent intent = new Intent(this, openTrivago.class);
        startActivity(intent);
    }

    public void yatra (View view) {
        Intent intent = new Intent(this, openYatra.class);
        startActivity(intent);
    }

    public void goibibo (View view) {
        Intent intent = new Intent(this, openGoibibo.class);
        startActivity(intent);
    }
}

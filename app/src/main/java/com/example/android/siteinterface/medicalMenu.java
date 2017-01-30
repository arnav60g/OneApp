package com.example.android.siteinterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class medicalMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_menu);
    }

    public void webmd (View view) {
        Intent intent = new Intent(this, openWebmd.class);
        startActivity(intent);
    }

    public void practo (View view) {
        Intent intent = new Intent(this, openPracto.class);
        startActivity(intent);
    }
}

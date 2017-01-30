package com.example.android.siteinterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mailMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_menu);
    }

    public void gmail (View view) {
        Intent intent = new Intent(this, openGmail.class);
        startActivity(intent);
    }

    public void outlook (View view) {
        Intent intent = new Intent(this, openOutlook.class);
        startActivity(intent);
    }

    public void yahoo (View view) {
        Intent intent = new Intent(this, openYahoo.class);
        startActivity(intent);
    }
}

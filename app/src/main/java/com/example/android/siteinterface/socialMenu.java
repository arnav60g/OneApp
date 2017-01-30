package com.example.android.siteinterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class socialMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_menu);
    }

    public void facebook (View view) {
        Intent intent = new Intent(this, openFacebook.class);
        startActivity(intent);
    }

    public void twitter (View view) {
        Intent intent = new Intent(this, openTwitter.class);
        startActivity(intent);
    }
}

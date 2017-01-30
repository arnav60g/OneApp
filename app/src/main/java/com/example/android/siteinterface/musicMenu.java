package com.example.android.siteinterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class musicMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_menu);
    }

    public void saavn (View view) {
        Intent intent = new Intent(this, openSaavn.class);
        startActivity(intent);
    }

    public void gaana (View view) {
        Intent intent = new Intent(this, openGaana.class);
        startActivity(intent);
    }

    public void hungama (View view) {
        Intent intent = new Intent(this, openHungama.class);
        startActivity(intent);
    }
}

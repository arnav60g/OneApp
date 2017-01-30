package com.example.android.siteinterface;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openShopping (View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        startActivity(intent);
    }

    public void openSocial (View view)  {
        Intent intent = new Intent(this, socialMenu.class);
        startActivity(intent);
    }

    public void openLearning (View view)  {
        Intent intent = new Intent(this, learningMenu.class);
        startActivity(intent);
    }

    public void openWikipedia (View view)  {
        Intent intent = new Intent(this, wikipedia.class);
        startActivity(intent);
    }

    public void openVideo (View view)  {
        Intent intent = new Intent(this, videoMenu.class);
        startActivity(intent);
    }

    public void openBill (View view)  {
        Intent intent = new Intent(this, bill.class);
        startActivity(intent);
    }

    public void openMusic (View view)  {
        Intent intent = new Intent(this, musicMenu.class);
        startActivity(intent);
    }

    public void openNews (View view)  {
        Intent intent = new Intent(this, newsMenu.class);
        startActivity(intent);
    }

    public void openMail (View view)  {
        Intent intent = new Intent(this, mailMenu.class);
        startActivity(intent);
    }

    public void openTravel (View view)  {
        Intent intent = new Intent(this, travelMenu.class);
        startActivity(intent);
    }

    public void openMaps (View view)  {
        Intent intent = new Intent(this, maps.class);
        startActivity(intent);
    }

    public void openMedical (View view)  {
        Intent intent = new Intent(this, medicalMenu.class);
        startActivity(intent);
    }

    public void openRecharge (View view)  {
        Intent intent = new Intent(this, rechargeMenu.class);
        startActivity(intent);
    }

    public void openWeather (View view)  {
        Intent intent = new Intent(this, weather.class);
        startActivity(intent);
    }


}

package com.example.android.siteinterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class rechargeMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge_menu);
    }

    public void paytm (View view) {
        Intent intent = new Intent(this, openPaytm.class);
        startActivity(intent);
    }

    public void freecharge (View view) {
        Intent intent = new Intent(this, openFreecharge.class);
        startActivity(intent);
    }
}

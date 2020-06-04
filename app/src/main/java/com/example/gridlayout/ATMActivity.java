package com.example.gridlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ATMActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atm);
    }

    public void callback(View view) {
        Intent pindah = new Intent(ATMActivity.this, MainActivity.class);
        startActivity(pindah);
        finish();
    }
}

package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calltpr(View view) {
        Intent pindah = new Intent(MainActivity.this, TprActivity.class);
        startActivity(pindah);
        finish();
    }

    public void callkonven(View view) {
        Intent pindah = new Intent(MainActivity.this, KonvenActivity.class);
        startActivity(pindah);
        finish();
    }

    public void callatm(View view) {
        Intent pindah = new Intent(MainActivity.this, ATMActivity.class);
        startActivity(pindah);
        finish();
    }

    public void callsyariah(View view) {
        Intent pindah = new Intent(MainActivity.this, SyariahActivity.class);
        startActivity(pindah);
        finish();
    }

    public void callsdb(View view) {
        Intent pindah = new Intent(MainActivity.this, SdbActivity.class);
        startActivity(pindah);
        finish();
    }

    public void callcommerce(View view) {
        Intent pindah = new Intent(MainActivity.this, CommerceActivity.class);
        startActivity(pindah);
        finish();
    }

}

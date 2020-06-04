package com.example.gridlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KonvenActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.konven);
    }

    public void callback(View view) {
        Intent pindah = new Intent(KonvenActivity.this, MainActivity.class);
        startActivity(pindah);
        finish();
    }
}

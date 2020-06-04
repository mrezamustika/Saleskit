package com.example.gridlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CommerceActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commerce);
    }

    public void callback(View view) {
        Intent pindah = new Intent(CommerceActivity.this, MainActivity.class);
        startActivity(pindah);
        finish();
    }
}

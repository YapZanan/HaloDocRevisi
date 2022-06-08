package com.uty.halodocrevisi.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uty.halodocrevisi.MainActivity;
import com.uty.halodocrevisi.R;

public class PembayaranActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);
    }

    public void bayardong(View view) {
        Intent intent = new Intent(PembayaranActivity.this, PembayaranSuksesActivity.class);
        startActivity(intent);
        finish();
    }
}
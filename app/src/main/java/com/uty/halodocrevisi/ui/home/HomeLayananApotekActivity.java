package com.uty.halodocrevisi.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uty.halodocrevisi.MainActivity;
import com.uty.halodocrevisi.R;

public class HomeLayananApotekActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_layanan_apotek);
    }

    public void btnBack2(View view) {
        Intent intent = new Intent(HomeLayananApotekActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}
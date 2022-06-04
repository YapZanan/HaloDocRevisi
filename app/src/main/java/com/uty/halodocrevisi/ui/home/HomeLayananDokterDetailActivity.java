package com.uty.halodocrevisi.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uty.halodocrevisi.R;

public class HomeLayananDokterDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_layanan_dokter_detail);
    }

    public void ibDokDetBack(View view) {
        Intent intent = new Intent(HomeLayananDokterDetailActivity.this, HomeLayananDokterActivity.class);
        startActivity(intent);
        finish();
    }

    public void btnKonsul(View view) {
        Intent intent = new Intent(HomeLayananDokterDetailActivity.this, PembayaranActivity.class);
        startActivity(intent);
        finish();
    }

}
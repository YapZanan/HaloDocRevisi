package com.uty.halodocrevisi.ui.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.window.SplashScreen;

import com.uty.halodocrevisi.MainActivity;
import com.uty.halodocrevisi.R;

public class PembayaranSuksesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pembayaran_sukses);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(PembayaranSuksesActivity.this, MainActivity.class);
                startActivity(home);
                finish();

            }
        },1000);
    }
}
package com.uty.halodocrevisi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.uty.halodocrevisi.databinding.ActivityMainBinding;
import com.uty.halodocrevisi.ui.home.HomeLayananApotekActivity;
import com.uty.halodocrevisi.ui.home.HomeLayananDokterActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

    public void btnDokter(View view) {
        Intent intent = new Intent(MainActivity.this, HomeLayananDokterActivity.class);
        startActivity(intent);
    }

    public void btnObat(View view) {
        Intent intent = new Intent(MainActivity.this, HomeLayananApotekActivity.class);
        startActivity(intent);
    }

}
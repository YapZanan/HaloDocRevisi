package com.uty.halodocrevisi;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.uty.halodocrevisi.databinding.ActivityMainBinding;
import com.uty.halodocrevisi.ui.home.FragmentHome;
import com.uty.halodocrevisi.ui.notifikasi.FragmentNotifikasi;
import com.uty.halodocrevisi.ui.pesan.FragmentPesan;
import com.uty.halodocrevisi.ui.riwayat.FragmentRiwayat;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);

//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
        getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_activity_main, new FragmentHome()).commit();
        navView.setOnItemSelectedListener(navListener);

    }

    private BottomNavigationView.OnItemSelectedListener navListener = new BottomNavigationView.OnItemSelectedListener(){

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = new FragmentHome();
            int selectedItemId = BottomNavigationView.
            System.out.println(selectedItemId);

            if(item.getItemId() == R.id.navigation_Home){
                selectedFragment = new FragmentHome();
                System.out.println(selectedFragment);
                System.out.println("bbb");
            }
            else if(item.getItemId() == R.id.navigation_Riwayat){
                selectedFragment = new FragmentRiwayat();
            }
            else if(item.getItemId() == R.id.navigation_Pesan){
                selectedFragment = new FragmentPesan();
            }
            else if(item.getItemId() == R.id.navigation_Notifikasi){
                selectedFragment = new FragmentNotifikasi();
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment_activity_main, selectedFragment).commit();
            return true;
        }
    };
}
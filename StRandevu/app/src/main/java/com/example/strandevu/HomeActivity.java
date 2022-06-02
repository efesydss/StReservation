package com.example.strandevu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    private BottomNavigationView bottomtut;
    private Fragment temp;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //getSupportFragmentManager().beginTransaction().add(R.id.fragmenttutucu,new fragmentClass()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentTutucu,new fragmentClass()).commit();

    }
}
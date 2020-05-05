package com.example.udiploma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    private BottomNavigationView navView ;
    private FrameLayout frameLayout;
    private HomeFragment home_fragment;
    private NoticeFragment noticeFragment;
    private ResultFragment resultFragment;
    private AccountFragment accountFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        navView = findViewById(R.id.main_nav);
        frameLayout = findViewById(R.id.main_frame);

        home_fragment = new HomeFragment();
        accountFragment = new AccountFragment();
        noticeFragment = new NoticeFragment();
        resultFragment = new ResultFragment();
        accountFragment = new AccountFragment();

        setFragment(home_fragment);

        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        setFragment(home_fragment);
                        return true;
                    case R.id.navigation_notification:
                        setFragment(noticeFragment);
                        return true;
                    case R.id.navigation_result:
                        setFragment(resultFragment);
                        return true;
                    case R.id.navigation_Account:
                        setFragment(accountFragment);
                        return true;
                    default:
                        return false;
                }
            }

        });
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment).addToBackStack(null).commit();
    }
}

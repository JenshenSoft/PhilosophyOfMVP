package com.philosophy.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.philosophy.mvp.main.MainFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, new MainFragment())
                    .commit();
        }

    }
}

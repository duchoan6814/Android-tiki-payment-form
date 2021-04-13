package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.frameAbove, new AboveFragment(),null)
                .disallowAddToBackStack()
                .commit();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.frmDuoi, new DuoiFragment(), "DuoiFragment")
                .disallowAddToBackStack()
                .commit();
    }
}
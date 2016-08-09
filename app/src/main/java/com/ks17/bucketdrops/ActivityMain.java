package com.ks17.bucketdrops;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ActivityMain extends AppCompatActivity {
    Toolbar toolbar;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setBackground();
    }

    private void setBackground() {
        imageView = (ImageView) findViewById(R.id.bd_background);
        Glide.with(this).load(R.drawable.background).centerCrop().
                into(imageView);

    }
}

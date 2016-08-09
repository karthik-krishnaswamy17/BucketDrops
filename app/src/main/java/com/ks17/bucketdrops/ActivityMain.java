package com.ks17.bucketdrops;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class ActivityMain extends AppCompatActivity {
    Toolbar toolbar;
    ImageView imageView;
    Button bt_click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setBackground();
        bt_click = (Button) findViewById(R.id.btn_drop);
        bt_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityMain.this, "Clicked from Anonymous class", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void setBackground() {
        imageView = (ImageView) findViewById(R.id.bd_background);
        Glide.with(this).load(R.drawable.background).centerCrop().
                into(imageView);

    }
}

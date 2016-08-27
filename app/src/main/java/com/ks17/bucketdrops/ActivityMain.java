package com.ks17.bucketdrops;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.facebook.stetho.Stetho;
import com.uphyca.stetho_realm.RealmInspectorModulesProvider;

public class ActivityMain extends AppCompatActivity {

    Toolbar toolbar;
    ImageView imageView;
    Button bt_click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(RealmInspectorModulesProvider.builder(this).build())
                        .build());

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setBackground();
        bt_click = (Button) findViewById(R.id.btn_drop);
        bt_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDailog();
            }
        });

    }

    private void showDailog() {
        Dialog dialog = new Dialog();
        dialog.show(getSupportFragmentManager(), "Add");
    }

    private void setBackground() {
        imageView = (ImageView) findViewById(R.id.bd_background);
        Glide.with(this).load(R.drawable.background).centerCrop().
                into(imageView);

    }
}

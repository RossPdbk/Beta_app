package com.mumbaiengineers.beta_app;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class  MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView btnAoa, btnCoa, btnOs, btnCg;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimary));
        }

        mAdView=(AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                mAdView.setVisibility(View.VISIBLE);
            }
        });


        btnAoa = (ImageView) findViewById(R.id.btn_aoa);
        btnCoa = (ImageView) findViewById(R.id.btn_coa);
        btnCg = (ImageView) findViewById(R.id.btn_cg);
        btnOs = (ImageView) findViewById(R.id.btn_os);

        btnAoa.setOnClickListener(this);
        btnCoa.setOnClickListener(this);
        btnCg.setOnClickListener(this);
        btnOs.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.btn_aoa:
                Intent intent = new Intent(this,AoaHome.class);
                startActivity(intent);
                break;
            case R.id.btn_coa:
                Intent intent1 = new Intent(this,coaHome.class);
                startActivity(intent1);
                break;
            case R.id.btn_cg:
                Intent intent2 = new Intent(this,cgHome.class);
                startActivity(intent2);
                break;
            case R.id.btn_os:
                Intent intent3 = new Intent(this,osHome.class);
                startActivity(intent3);
                break;
        }
    }

    @Override
    public void onBackPressed(){

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        builder.setMessage("Do you want to Exit?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.super.onBackPressed();
                    }
                })
                .setNegativeButton("Cancel",null).setCancelable(false);
        AlertDialog alert = builder.create();
        alert.show();
    }
}

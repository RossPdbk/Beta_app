package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class cgPractical extends BaseActivity implements View.OnClickListener {

    TextView cgPracticalP1, cgPracticalP2, cgPracticalP3, cgPracticalP4 ,cgPracticalP5,cgPracticalP6,cgPracticalP7,cgPracticalP8,cgPracticalP9;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg_practical);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

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

        cgPracticalP1 = (TextView) findViewById(R.id.cgPracticalP1);
        cgPracticalP2 = (TextView) findViewById(R.id.cgPracticalP2);
        cgPracticalP3 = (TextView) findViewById(R.id.cgPracticalP3);
        cgPracticalP4 = (TextView) findViewById(R.id.cgPracticalP4);
        cgPracticalP5 = (TextView) findViewById(R.id.cgPracticalP5);
        cgPracticalP6 = (TextView) findViewById(R.id.cgPracticalP6);
        cgPracticalP7 = (TextView) findViewById(R.id.cgPracticalP7);
        cgPracticalP8 = (TextView) findViewById(R.id.cgPracticalP8);
        cgPracticalP9 = (TextView) findViewById(R.id.cgPracticalP9);

        cgPracticalP1.setOnClickListener(this);
        cgPracticalP2.setOnClickListener(this);
        cgPracticalP3.setOnClickListener(this);
        cgPracticalP4.setOnClickListener(this);
        cgPracticalP5.setOnClickListener(this);
        cgPracticalP6.setOnClickListener(this);
        cgPracticalP7.setOnClickListener(this);
        cgPracticalP8.setOnClickListener(this);
        cgPracticalP9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);
    }

}

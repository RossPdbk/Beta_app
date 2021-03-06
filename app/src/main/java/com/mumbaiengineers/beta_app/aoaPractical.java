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

public class aoaPractical extends BaseActivity implements View.OnClickListener {

    TextView aoaPracticalP1, aoaPracticalP2, aoaPracticalP3, aoaPracticalP4, aoaPracticalP5, aoaPracticalP6, aoaPracticalP7;
    TextView aoaPracticalP8, aoaPracticalP9, aoaPracticalP10, aoaPracticalP11, aoaPracticalP12, aoaPracticalP13, aoaPracticalP14;
    TextView aoaPracticalP15, aoaPracticalP16, aoaPracticalP17, aoaPracticalP18, aoaPracticalP19;

    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aoa_practical);
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
        mAdView.setAdListener( new AdListener() {
            @Override
            public void onAdLoaded(){
                super.onAdLoaded();
                mAdView.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAdFailedToLoad(int error) {
                mAdView.setVisibility(View.GONE);
            }

        } );

        aoaPracticalP1 = (TextView) findViewById(R.id.aoaPracticalP1);
        aoaPracticalP2 = (TextView) findViewById(R.id.aoaPracticalP2);
        aoaPracticalP3 = (TextView) findViewById(R.id.aoaPracticalP3);
        aoaPracticalP4 = (TextView) findViewById(R.id.aoaPracticalP4);
        aoaPracticalP5 = (TextView) findViewById(R.id.aoaPracticalP5);
        aoaPracticalP6 = (TextView) findViewById(R.id.aoaPracticalP6);
        aoaPracticalP7 = (TextView) findViewById(R.id.aoaPracticalP7);
        aoaPracticalP8 = (TextView) findViewById(R.id.aoaPracticalP8);
        aoaPracticalP9 = (TextView) findViewById(R.id.aoaPracticalP9);
        aoaPracticalP10 = (TextView) findViewById(R.id.aoaPracticalP10);
        aoaPracticalP11 = (TextView) findViewById(R.id.aoaPracticalP11);
        aoaPracticalP12 = (TextView) findViewById(R.id.aoaPracticalP12);
        aoaPracticalP13 = (TextView) findViewById(R.id.aoaPracticalP13);
        aoaPracticalP14 = (TextView) findViewById(R.id.aoaPracticalP14);
        aoaPracticalP15 = (TextView) findViewById(R.id.aoaPracticalP15);
        aoaPracticalP16 = (TextView) findViewById(R.id.aoaPracticalP16);
        aoaPracticalP17 = (TextView) findViewById(R.id.aoaPracticalP17);
        aoaPracticalP18 = (TextView) findViewById(R.id.aoaPracticalP18);
        aoaPracticalP19 = (TextView) findViewById(R.id.aoaPracticalP19);

        aoaPracticalP1.setOnClickListener(this);
        aoaPracticalP2.setOnClickListener(this);
        aoaPracticalP3.setOnClickListener(this);
        aoaPracticalP4.setOnClickListener(this);
        aoaPracticalP5.setOnClickListener(this);
        aoaPracticalP6.setOnClickListener(this);
        aoaPracticalP7.setOnClickListener(this);
        aoaPracticalP8.setOnClickListener(this);
        aoaPracticalP9.setOnClickListener(this);
        aoaPracticalP10.setOnClickListener(this);
        aoaPracticalP11.setOnClickListener(this);
        aoaPracticalP12.setOnClickListener(this);
        aoaPracticalP13.setOnClickListener(this);
        aoaPracticalP14.setOnClickListener(this);
        aoaPracticalP15.setOnClickListener(this);
        aoaPracticalP16.setOnClickListener(this);
        aoaPracticalP17.setOnClickListener(this);
        aoaPracticalP18.setOnClickListener(this);
        aoaPracticalP19.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);
    }

}

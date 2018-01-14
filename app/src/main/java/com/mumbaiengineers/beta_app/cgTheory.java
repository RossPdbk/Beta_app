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

public class cgTheory extends BaseActivity implements View.OnClickListener {

    TextView cgTheoryQ1,cgTheoryQ2,cgTheoryQ3,cgTheoryQ4,cgTheoryQ5,cgTheoryQ6,cgTheoryQ7,cgTheoryQ8,cgTheoryQ9,cgTheoryQ10,cgTheoryQ11,cgTheoryQ12,cgTheoryQ13,cgTheoryQ14,cgTheoryQ15,cgTheoryQ16,cgTheoryQ17, cgTheoryQ18,cgTheoryQ19,cgTheoryQ20,cgTheoryQ21,cgTheoryQ22,cgTheoryQ23,
            cgTheoryQ24,cgTheoryQ25,cgTheoryQ26,cgTheoryQ27,cgTheoryQ28,cgTheoryQ29,cgTheoryQ30;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg_theory);
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

        cgTheoryQ1 = (TextView) findViewById(R.id.cgTheoryQ1);
        cgTheoryQ2 = (TextView) findViewById(R.id.cgTheoryQ2);
        cgTheoryQ3 = (TextView) findViewById(R.id.cgTheoryQ3);
        cgTheoryQ4 = (TextView) findViewById(R.id.cgTheoryQ4);
        cgTheoryQ5 = (TextView) findViewById(R.id.cgTheoryQ5);
        cgTheoryQ6 = (TextView) findViewById(R.id.cgTheoryQ6);
        cgTheoryQ7 = (TextView) findViewById(R.id.cgTheoryQ7);
        cgTheoryQ8 = (TextView) findViewById(R.id.cgTheoryQ8);
        cgTheoryQ9 = (TextView) findViewById(R.id.cgTheoryQ9);
        cgTheoryQ10 = (TextView) findViewById(R.id.cgTheoryQ10);
        cgTheoryQ11 = (TextView) findViewById(R.id.cgTheoryQ11);
        cgTheoryQ12 = (TextView) findViewById(R.id.cgTheoryQ12);
        cgTheoryQ13 = (TextView) findViewById(R.id.cgTheoryQ13);
        cgTheoryQ14 = (TextView) findViewById(R.id.cgTheoryQ14);
        cgTheoryQ15 = (TextView) findViewById(R.id.cgTheoryQ15);
        cgTheoryQ16 = (TextView) findViewById(R.id.cgTheoryQ16);
        cgTheoryQ17 = (TextView) findViewById(R.id.cgTheoryQ17);
        cgTheoryQ18 = (TextView) findViewById(R.id.cgTheoryQ18);
        cgTheoryQ19 = (TextView) findViewById(R.id.cgTheoryQ19);
        cgTheoryQ20 = (TextView) findViewById(R.id.cgTheoryQ20);
        cgTheoryQ21 = (TextView) findViewById(R.id.cgTheoryQ21);
        cgTheoryQ22 = (TextView) findViewById(R.id.cgTheoryQ22);
        cgTheoryQ23 = (TextView) findViewById(R.id.cgTheoryQ23);
        cgTheoryQ24 = (TextView) findViewById(R.id.cgTheoryQ24);
        cgTheoryQ25 = (TextView) findViewById(R.id.cgTheoryQ25);
        cgTheoryQ26 = (TextView) findViewById(R.id.cgTheoryQ26);
        cgTheoryQ27 = (TextView) findViewById(R.id.cgTheoryQ27);
        cgTheoryQ28 = (TextView) findViewById(R.id.cgTheoryQ28);
        cgTheoryQ29 = (TextView) findViewById(R.id.cgTheoryQ29);
        cgTheoryQ30 = (TextView) findViewById(R.id.cgTheoryQ30);










        cgTheoryQ1.setOnClickListener(this);
        cgTheoryQ2.setOnClickListener(this);
        cgTheoryQ3.setOnClickListener(this);
        cgTheoryQ4.setOnClickListener(this);
        cgTheoryQ5.setOnClickListener(this);
        cgTheoryQ6.setOnClickListener(this);
        cgTheoryQ7.setOnClickListener(this);
        cgTheoryQ8.setOnClickListener(this);
        cgTheoryQ9.setOnClickListener(this);
        cgTheoryQ10.setOnClickListener(this);
        cgTheoryQ11.setOnClickListener(this);
        cgTheoryQ12.setOnClickListener(this);
        cgTheoryQ13.setOnClickListener(this);
        cgTheoryQ14.setOnClickListener(this);
        cgTheoryQ15.setOnClickListener(this);
        cgTheoryQ16.setOnClickListener(this);
        cgTheoryQ17.setOnClickListener(this);
        cgTheoryQ18.setOnClickListener(this);
        cgTheoryQ19.setOnClickListener(this);
        cgTheoryQ20.setOnClickListener(this);
        cgTheoryQ21.setOnClickListener(this);
        cgTheoryQ22.setOnClickListener(this);
        cgTheoryQ23.setOnClickListener(this);
        cgTheoryQ24.setOnClickListener(this);
        cgTheoryQ25.setOnClickListener(this);
        cgTheoryQ26.setOnClickListener(this);
        cgTheoryQ27.setOnClickListener(this);
        cgTheoryQ28.setOnClickListener(this);
        cgTheoryQ29.setOnClickListener(this);
        cgTheoryQ30.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);

    }

<<<<<<< HEAD
=======

>>>>>>> ce53e825d3d85e52a908104b90c7c559f4d6c36e
}

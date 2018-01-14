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
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class coaTheory extends BaseActivity implements View.OnClickListener {
    TextView coaTheoryQ1,coaTheoryQ2,coaTheoryQ3,coaTheoryQ4,coaTheoryQ5,coaTheoryQ6,coaTheoryQ7,coaTheoryQ8,coaTheoryQ9,coaTheoryQ10,coaTheoryQ11,coaTheoryQ12,coaTheoryQ13,coaTheoryQ14,coaTheoryQ15,coaTheoryQ16,coaTheoryQ17,coaTheoryQ18,coaTheoryQ19,coaTheoryQ20,coaTheoryQ21, coaTheoryQ22, coaTheoryQ23,coaTheoryQ24,coaTheoryQ25,coaTheoryQ26,coaTheoryQ27,coaTheoryQ28,coaTheoryQ29,coaTheoryQ30;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coa_theory);
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

        coaTheoryQ1 = (TextView) findViewById(R.id.coaTheoryQ1);
        coaTheoryQ2 = (TextView) findViewById(R.id.coaTheoryQ2);
        coaTheoryQ3 = (TextView) findViewById(R.id.coaTheoryQ3);
        coaTheoryQ4 = (TextView) findViewById(R.id.coaTheoryQ4);
        coaTheoryQ5 = (TextView) findViewById(R.id.coaTheoryQ5);
        coaTheoryQ6 = (TextView) findViewById(R.id.coaTheoryQ6);
        coaTheoryQ7 = (TextView) findViewById(R.id.coaTheoryQ7);
        coaTheoryQ8 = (TextView) findViewById(R.id.coaTheoryQ8);
        coaTheoryQ9 = (TextView) findViewById(R.id.coaTheoryQ9);
        coaTheoryQ10 = (TextView) findViewById(R.id.coaTheoryQ10);
        coaTheoryQ11= (TextView) findViewById(R.id.coaTheoryQ11);
        coaTheoryQ12 = (TextView) findViewById(R.id.coaTheoryQ12);
        coaTheoryQ13= (TextView) findViewById(R.id.coaTheoryQ13);
        coaTheoryQ14= (TextView) findViewById(R.id.coaTheoryQ14);
        coaTheoryQ15= (TextView) findViewById(R.id.coaTheoryQ15);
        coaTheoryQ16= (TextView) findViewById(R.id.coaTheoryQ16);
        coaTheoryQ17= (TextView) findViewById(R.id.coaTheoryQ17);
        coaTheoryQ18= (TextView) findViewById(R.id.coaTheoryQ18);
        coaTheoryQ19= (TextView) findViewById(R.id.coaTheoryQ19);
        coaTheoryQ20= (TextView) findViewById(R.id.coaTheoryQ20);
        coaTheoryQ21= (TextView) findViewById(R.id.coaTheoryQ21);
        coaTheoryQ22= (TextView) findViewById(R.id.coaTheoryQ22);
        coaTheoryQ23= (TextView) findViewById(R.id.coaTheoryQ23);
        coaTheoryQ24= (TextView) findViewById(R.id.coaTheoryQ24);
        coaTheoryQ25= (TextView) findViewById(R.id.coaTheoryQ25);
        coaTheoryQ26= (TextView) findViewById(R.id.coaTheoryQ26);
        coaTheoryQ27= (TextView) findViewById(R.id.coaTheoryQ27);
        coaTheoryQ28= (TextView) findViewById(R.id.coaTheoryQ28);
        coaTheoryQ29= (TextView) findViewById(R.id.coaTheoryQ29);
        coaTheoryQ30= (TextView) findViewById(R.id.coaTheoryQ30);


        coaTheoryQ1.setOnClickListener(this);
        coaTheoryQ2.setOnClickListener(this);
        coaTheoryQ3.setOnClickListener(this);
        coaTheoryQ4.setOnClickListener(this);
        coaTheoryQ5.setOnClickListener(this);
        coaTheoryQ6.setOnClickListener(this);
        coaTheoryQ7.setOnClickListener(this);
        coaTheoryQ8.setOnClickListener(this);
        coaTheoryQ9.setOnClickListener(this);
        coaTheoryQ10.setOnClickListener(this);
        coaTheoryQ11.setOnClickListener(this);
        coaTheoryQ12.setOnClickListener(this);
        coaTheoryQ13.setOnClickListener(this);
        coaTheoryQ14.setOnClickListener(this);
        coaTheoryQ15.setOnClickListener(this);
        coaTheoryQ16.setOnClickListener(this);
        coaTheoryQ17.setOnClickListener(this);
        coaTheoryQ18.setOnClickListener(this);
        coaTheoryQ19.setOnClickListener(this);
        coaTheoryQ20.setOnClickListener(this);
        coaTheoryQ21.setOnClickListener(this);
        coaTheoryQ22.setOnClickListener(this);
        coaTheoryQ23.setOnClickListener(this);
        coaTheoryQ24.setOnClickListener(this);
        coaTheoryQ25.setOnClickListener(this);
        coaTheoryQ26.setOnClickListener(this);
        coaTheoryQ27.setOnClickListener(this);
        coaTheoryQ28.setOnClickListener(this);
        coaTheoryQ29.setOnClickListener(this);
        coaTheoryQ30.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);
    }

}

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

public class aoaTheory extends AppCompatActivity implements View.OnClickListener {
    TextView aoaTheoryQ1, aoaTheoryQ2, aoaTheoryQ3, aoaTheoryQ4, aoaTheoryQ5, aoaTheoryQ6, aoaTheoryQ7, aoaTheoryQ8, aoaTheoryQ9, aoaTheoryQ10;
    TextView aoaTheoryQ11, aoaTheoryQ12, aoaTheoryQ13, aoaTheoryQ14, aoaTheoryQ15, aoaTheoryQ16, aoaTheoryQ17, aoaTheoryQ18, aoaTheoryQ19, aoaTheoryQ20, aoaTheoryQ21, aoaTheoryQ22;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aoa_theory);
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

        aoaTheoryQ1 = (TextView) findViewById(R.id.aoaTheoryQ1);
        aoaTheoryQ2 = (TextView) findViewById(R.id.aoaTheoryQ2);
        aoaTheoryQ3 = (TextView) findViewById(R.id.aoaTheoryQ3);
        aoaTheoryQ4 = (TextView) findViewById(R.id.aoaTheoryQ4);
        aoaTheoryQ5 = (TextView) findViewById(R.id.aoaTheoryQ5);
        aoaTheoryQ6 = (TextView) findViewById(R.id.aoaTheoryQ6);
        aoaTheoryQ7 = (TextView) findViewById(R.id.aoaTheoryQ7);
        aoaTheoryQ8 = (TextView) findViewById(R.id.aoaTheoryQ8);
        aoaTheoryQ9 = (TextView) findViewById(R.id.aoaTheoryQ9);
        aoaTheoryQ10 = (TextView) findViewById(R.id.aoaTheoryQ10);
        aoaTheoryQ11 = (TextView) findViewById(R.id.aoaTheoryQ11);
        aoaTheoryQ12 = (TextView) findViewById(R.id.aoaTheoryQ12);
        aoaTheoryQ13 = (TextView) findViewById(R.id.aoaTheoryQ13);
        aoaTheoryQ14 = (TextView) findViewById(R.id.aoaTheoryQ14);
        aoaTheoryQ15 = (TextView) findViewById(R.id.aoaTheoryQ15);
        aoaTheoryQ16 = (TextView) findViewById(R.id.aoaTheoryQ16);
        aoaTheoryQ17 = (TextView) findViewById(R.id.aoaTheoryQ17);
        aoaTheoryQ18 = (TextView) findViewById(R.id.aoaTheoryQ18);
        aoaTheoryQ19 = (TextView) findViewById(R.id.aoaTheoryQ19);
        aoaTheoryQ20 = (TextView) findViewById(R.id.aoaTheoryQ20);
        aoaTheoryQ21 = (TextView) findViewById(R.id.aoaTheoryQ21);
        aoaTheoryQ22 = (TextView) findViewById(R.id.aoaTheoryQ22);

        aoaTheoryQ1.setOnClickListener(this);
        aoaTheoryQ2.setOnClickListener(this);
        aoaTheoryQ3.setOnClickListener(this);
        aoaTheoryQ4.setOnClickListener(this);
        aoaTheoryQ5.setOnClickListener(this);
        aoaTheoryQ6.setOnClickListener(this);
        aoaTheoryQ7.setOnClickListener(this);
        aoaTheoryQ8.setOnClickListener(this);
        aoaTheoryQ9.setOnClickListener(this);
        aoaTheoryQ10.setOnClickListener(this);
        aoaTheoryQ11.setOnClickListener(this);
        aoaTheoryQ12.setOnClickListener(this);
        aoaTheoryQ13.setOnClickListener(this);
        aoaTheoryQ14.setOnClickListener(this);
        aoaTheoryQ15.setOnClickListener(this);
        aoaTheoryQ16.setOnClickListener(this);
        aoaTheoryQ17.setOnClickListener(this);
        aoaTheoryQ18.setOnClickListener(this);
        aoaTheoryQ19.setOnClickListener(this);
        aoaTheoryQ20.setOnClickListener(this);
        aoaTheoryQ21.setOnClickListener(this);
        aoaTheoryQ22.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.shareid:
                Toast.makeText(this, "Share clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.feedbackid:
                Toast.makeText(this, "Feedback clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.rateid:
                Toast.makeText(this, "Rate Us clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.reportid:
                Toast.makeText(this, "Report Bug clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.aboutid:
                Toast.makeText(this, "About us clicked", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

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
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import org.w3c.dom.Text;

public class osTheory extends AppCompatActivity implements View.OnClickListener {
    TextView osTheoryQ1,osTheoryQ2,osTheoryQ3,osTheoryQ4,osTheoryQ5,osTheoryQ6,osTheoryQ7,osTheoryQ8,osTheoryQ9,osTheoryQ10,osTheoryQ11,osTheoryQ12,
            osTheoryQ13,osTheoryQ14,osTheoryQ15,osTheoryQ16,osTheoryQ17,osTheoryQ18,osTheoryQ19,osTheoryQ20,osTheoryQ21,osTheoryQ22,osTheoryQ23,osTheoryQ24
            ,osTheoryQ25,osTheoryQ26,osTheoryQ27;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_theory);
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

        osTheoryQ1 = (TextView) findViewById(R.id.osTheoryQ1);
        osTheoryQ2 = (TextView) findViewById(R.id.osTheoryQ2);
        osTheoryQ3 = (TextView) findViewById(R.id.osTheoryQ3);
        osTheoryQ4 = (TextView) findViewById(R.id.osTheoryQ4);
        osTheoryQ5 = (TextView) findViewById(R.id.osTheoryQ5);
        osTheoryQ6 = (TextView) findViewById(R.id.osTheoryQ6);
        osTheoryQ7 = (TextView) findViewById(R.id.osTheoryQ7);
        osTheoryQ8 = (TextView) findViewById(R.id.osTheoryQ8);
        osTheoryQ9 = (TextView) findViewById(R.id.osTheoryQ9);
        osTheoryQ10 = (TextView) findViewById(R.id.osTheoryQ10);
        osTheoryQ11 = (TextView) findViewById(R.id.osTheoryQ11);
        osTheoryQ12 = (TextView) findViewById(R.id.osTheoryQ12);
        osTheoryQ13 = (TextView) findViewById(R.id.osTheoryQ13);
        osTheoryQ14 = (TextView) findViewById(R.id.osTheoryQ14);
        osTheoryQ15 = (TextView) findViewById(R.id.osTheoryQ15);
        osTheoryQ16 = (TextView) findViewById(R.id.osTheoryQ16);
        osTheoryQ17 = (TextView) findViewById(R.id.osTheoryQ17);
        osTheoryQ18 = (TextView) findViewById(R.id.osTheoryQ18);
        osTheoryQ19 = (TextView) findViewById(R.id.osTheoryQ19);
        osTheoryQ20 = (TextView) findViewById(R.id.osTheoryQ20);
        osTheoryQ21 = (TextView) findViewById(R.id.osTheoryQ21);
        osTheoryQ22 = (TextView) findViewById(R.id.osTheoryQ22);
        osTheoryQ23 = (TextView) findViewById(R.id.osTheoryQ23);
        osTheoryQ24 = (TextView) findViewById(R.id.osTheoryQ24);
        osTheoryQ25 = (TextView) findViewById(R.id.osTheoryQ25);
        osTheoryQ26 = (TextView) findViewById(R.id.osTheoryQ26);
        osTheoryQ27 = (TextView) findViewById(R.id.osTheoryQ27);



        osTheoryQ1.setOnClickListener(this);
        osTheoryQ2.setOnClickListener(this);
        osTheoryQ3.setOnClickListener(this);
        osTheoryQ4.setOnClickListener(this);
        osTheoryQ5.setOnClickListener(this);
        osTheoryQ6.setOnClickListener(this);
        osTheoryQ7.setOnClickListener(this);
        osTheoryQ8.setOnClickListener(this);
        osTheoryQ9.setOnClickListener(this);
        osTheoryQ10.setOnClickListener(this);
        osTheoryQ11.setOnClickListener(this);
        osTheoryQ12.setOnClickListener(this);
        osTheoryQ13.setOnClickListener(this);
        osTheoryQ14.setOnClickListener(this);
        osTheoryQ15.setOnClickListener(this);
        osTheoryQ16.setOnClickListener(this);
        osTheoryQ17.setOnClickListener(this);
        osTheoryQ18.setOnClickListener(this);
        osTheoryQ19.setOnClickListener(this);
        osTheoryQ20.setOnClickListener(this);
        osTheoryQ21.setOnClickListener(this);
        osTheoryQ22.setOnClickListener(this);
        osTheoryQ23.setOnClickListener(this);
        osTheoryQ24.setOnClickListener(this);
        osTheoryQ25.setOnClickListener(this);
        osTheoryQ26.setOnClickListener(this);
        osTheoryQ27.setOnClickListener(this);


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

package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class coaHome extends BaseActivity implements View.OnClickListener {
    ImageView coaTheory, coaPractical;
    TextView coaMfaQ1, coaMfaQ2, coaMfaQ3, coaMfaQ4, coaMfaQ5, coaMfaQ6, coaMfaQ7;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coa_home);
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

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        coaTheory = (ImageView) findViewById(R.id.coaTheory);
        coaPractical = (ImageView) findViewById(R.id.coaPractical);

        coaMfaQ1 = (TextView) findViewById(R.id.coaTheoryQ3);
        coaMfaQ2 = (TextView) findViewById(R.id.coaTheoryQ7);
        coaMfaQ3 = (TextView) findViewById(R.id.coaTheoryQ5);
        coaMfaQ4 = (TextView) findViewById(R.id.coaTheoryQ18);
        coaMfaQ5 = (TextView) findViewById(R.id.coaTheoryQ20);
        coaMfaQ6 = (TextView) findViewById(R.id.coaTheoryQ15);
        coaMfaQ7 = (TextView) findViewById(R.id.coaTheoryQ16);

        coaTheory.setOnClickListener(this);
        coaPractical.setOnClickListener(this);

        coaMfaQ1.setOnClickListener(this);
        coaMfaQ2.setOnClickListener(this);
        coaMfaQ3.setOnClickListener(this);
        coaMfaQ4.setOnClickListener(this);
        coaMfaQ5.setOnClickListener(this);
        coaMfaQ6.setOnClickListener(this);
        coaMfaQ7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.coaTheory:
                Intent intent = new Intent(this, coaTheory.class);
                startActivity(intent);
                break;
            case R.id.coaPractical:
                Intent intent1 = new Intent(this, coaPractical.class);
                startActivity(intent1);
                break;

            case R.id.coaTheoryQ3:
                Intent intent2 = new Intent(this, webviewAnswer.class);
                intent2.putExtra("Qid",id);
                startActivity(intent2);
                break;

            case R.id.coaTheoryQ7:
                Intent intent3 = new Intent(this, webviewAnswer.class);
                intent3.putExtra("Qid",id);
                startActivity(intent3);
                break;

            case R.id.coaTheoryQ5:
                Intent intent4 = new Intent(this, webviewAnswer.class);
                intent4.putExtra("Qid",id);
                startActivity(intent4);
                break;

            case R.id.coaTheoryQ18:
                Intent intent5 = new Intent(this, webviewAnswer.class);
                intent5.putExtra("Qid",id);
                startActivity(intent5);
                break;

            case R.id.coaTheoryQ20:
                Intent intent6 = new Intent(this, webviewAnswer.class);
                intent6.putExtra("Qid",id);
                startActivity(intent6);
                break;

            case R.id.coaTheoryQ15:
                Intent intent7 = new Intent(this, webviewAnswer.class);
                intent7.putExtra("Qid",id);
                startActivity(intent7);
                break;

            case R.id.coaTheoryQ16:
                Intent intent8 = new Intent(this, webviewAnswer.class);
                intent8.putExtra("Qid",id);
                startActivity(intent8);
                break;
        }
    }

}

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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class cgHome extends AppCompatActivity implements View.OnClickListener {
    ImageView cgTheory, cgPractical;
     TextView cgMfaQ1, cgMfaQ2, cgMfaQ3, cgMfaQ4, cgMfaQ5, cgMfaQ6, cgMfaQ7;

     private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg_home);
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

        cgTheory = (ImageView) findViewById(R.id.cgTheory);
        cgPractical = (ImageView) findViewById(R.id.cgPractical);

        cgMfaQ1 = (TextView) findViewById(R.id.cgTheoryQ1);
        cgMfaQ2 = (TextView) findViewById(R.id.cgTheoryQ5);
        cgMfaQ3 = (TextView) findViewById(R.id.cgTheoryQ8);
        cgMfaQ4 = (TextView) findViewById(R.id.cgTheoryQ9);
        cgMfaQ5 = (TextView) findViewById(R.id.cgTheoryQ11);
        cgMfaQ6 = (TextView) findViewById(R.id.cgTheoryQ16);
        cgMfaQ7 = (TextView) findViewById(R.id.cgTheoryQ14);

        cgTheory.setOnClickListener(this);
        cgPractical.setOnClickListener(this);

        cgMfaQ1.setOnClickListener(this);
        cgMfaQ2.setOnClickListener(this);
        cgMfaQ3.setOnClickListener(this);
        cgMfaQ4.setOnClickListener(this);
        cgMfaQ5.setOnClickListener(this);
        cgMfaQ6.setOnClickListener(this);
        cgMfaQ7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.cgTheory:
                Intent intent = new Intent(this, cgTheory.class);
                startActivity(intent);
                break;
            case R.id.cgPractical:
                Intent intent1 = new Intent(this, cgPractical.class);
                startActivity(intent1);
                break;

            case R.id.cgTheoryQ1:
                Intent intent2 = new Intent(this, webviewAnswer.class);
                intent2.putExtra("Qid",id);
                startActivity(intent2);
                break;

            case R.id.cgTheoryQ5:
                Intent intent3 = new Intent(this, webviewAnswer.class);
                intent3.putExtra("Qid",id);
                startActivity(intent3);
                break;

            case R.id.cgTheoryQ8:
                Intent intent4 = new Intent(this, webviewAnswer.class);
                intent4.putExtra("Qid",id);
                startActivity(intent4);
                break;

            case R.id.cgTheoryQ9:
                Intent intent5 = new Intent(this, webviewAnswer.class);
                intent5.putExtra("Qid",id);
                startActivity(intent5);
                break;

            case R.id.cgTheoryQ11:
                Intent intent6 = new Intent(this, webviewAnswer.class);
                intent6.putExtra("Qid",id);
                startActivity(intent6);
                break;

            case R.id.cgTheoryQ16:
                Intent intent7 = new Intent(this, webviewAnswer.class);
                intent7.putExtra("Qid",id);
                startActivity(intent7);
                break;

            case R.id.cgTheoryQ14:
                Intent intent8 = new Intent(this, webviewAnswer.class);
                intent8.putExtra("Qid",id);
                startActivity(intent8);
                break;
        }
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

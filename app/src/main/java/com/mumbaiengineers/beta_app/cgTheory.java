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

public class cgTheory extends AppCompatActivity implements View.OnClickListener {

    TextView cgTheoryQ1,cgTheoryQ2,cgTheoryQ3,cgTheoryQ4,cgTheoryQ5,cgTheoryQ6,cgTheoryQ7,cgTheoryQ8,cgTheoryQ9,cgTheoryQ10,cgTheoryQ11,cgTheoryQ12,cgTheoryQ13,cgTheoryQ14,cgTheoryQ15,cgTheoryQ16,cgTheoryQ17, cgTheoryQ18;

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

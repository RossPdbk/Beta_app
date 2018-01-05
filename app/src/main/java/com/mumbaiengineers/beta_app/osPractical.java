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

public class osPractical extends AppCompatActivity implements View.OnClickListener {

    TextView osPracticalP1,osPracticalP2,osPracticalP3,osPracticalP4,osPracticalP5,osPracticalP6,osPracticalP7,osPracticalP8,osPracticalP9,osPracticalP10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_practical);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.colorPrimary));
        }

        osPracticalP1 = (TextView)findViewById(R.id.osPracticalP1);
        osPracticalP2 = (TextView)findViewById(R.id.osPracticalP2);
        osPracticalP3 = (TextView)findViewById(R.id.osPracticalP3);
        osPracticalP4 = (TextView)findViewById(R.id.osPracticalP4);
        osPracticalP5 = (TextView)findViewById(R.id.osPracticalP5);
        osPracticalP6 = (TextView)findViewById(R.id.osPracticalP6);
        osPracticalP7 = (TextView)findViewById(R.id.osPracticalP7);
        osPracticalP8 = (TextView)findViewById(R.id.osPracticalP8);
        osPracticalP9 = (TextView)findViewById(R.id.osPracticalP9);
        osPracticalP10 = (TextView)findViewById(R.id.osPracticalP10);

        osPracticalP1.setOnClickListener(this);
        osPracticalP2.setOnClickListener(this);
        osPracticalP3.setOnClickListener(this);
        osPracticalP4.setOnClickListener(this);
        osPracticalP5.setOnClickListener(this);
        osPracticalP6.setOnClickListener(this);
        osPracticalP7.setOnClickListener(this);
        osPracticalP8.setOnClickListener(this);
        osPracticalP9.setOnClickListener(this);
        osPracticalP10.setOnClickListener(this);

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

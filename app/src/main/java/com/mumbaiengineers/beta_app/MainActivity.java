package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class  MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView btnAoa, btnCoa, btnOs, btnCg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);


        btnAoa = (ImageView) findViewById(R.id.btn_aoa);
        btnCoa = (ImageView) findViewById(R.id.btn_coa);
        btnCg = (ImageView) findViewById(R.id.btn_cg);
        btnOs = (ImageView) findViewById(R.id.btn_os);

        btnAoa.setOnClickListener(this);
        btnCoa.setOnClickListener(this);
        btnCg.setOnClickListener(this);
        btnOs.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.btn_aoa:
                Intent intent = new Intent(this,AoaHome.class);
                startActivity(intent);
                break;
            case R.id.btn_coa:
                Intent intent1 = new Intent(this,coaHome.class);
                startActivity(intent1);
                break;
            case R.id.btn_cg:
                Intent intent2 = new Intent(this,cgHome.class);
                startActivity(intent2);
                break;
            case R.id.btn_os:
                Intent intent3 = new Intent(this,osHome.class);
                startActivity(intent3);
                break;
        }
    }
}

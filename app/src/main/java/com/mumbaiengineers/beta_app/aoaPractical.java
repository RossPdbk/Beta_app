package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class aoaPractical extends AppCompatActivity implements View.OnClickListener {

    TextView aoaPracticalP1, aoaPracticalP2, aoaPracticalP3, aoaPracticalP4, aoaPracticalP5, aoaPracticalP6, aoaPracticalP7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aoa_practical);

        aoaPracticalP1 = (TextView) findViewById(R.id.aoaPracticalP1);
        aoaPracticalP2 = (TextView) findViewById(R.id.aoaPracticalP2);
        aoaPracticalP3 = (TextView) findViewById(R.id.aoaPracticalP3);
        aoaPracticalP4 = (TextView) findViewById(R.id.aoaPracticalP4);
        aoaPracticalP5 = (TextView) findViewById(R.id.aoaPracticalP5);
        aoaPracticalP6 = (TextView) findViewById(R.id.aoaPracticalP6);
        aoaPracticalP7 = (TextView) findViewById(R.id.aoaPracticalP7);

        aoaPracticalP1.setOnClickListener(this);
        aoaPracticalP2.setOnClickListener(this);
        aoaPracticalP3.setOnClickListener(this);
        aoaPracticalP4.setOnClickListener(this);
        aoaPracticalP5.setOnClickListener(this);
        aoaPracticalP6.setOnClickListener(this);
        aoaPracticalP7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);
    }
}

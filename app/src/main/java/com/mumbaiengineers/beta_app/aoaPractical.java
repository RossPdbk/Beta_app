package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aoaPractical extends AppCompatActivity implements View.OnClickListener {

    Button aoaPracticalP1, aoaPracticalP2, aoaPracticalP3, aoaPracticalP4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aoa_practical);

        aoaPracticalP1 = (Button) findViewById(R.id.aoaPracticalP1);
        aoaPracticalP2 = (Button) findViewById(R.id.aoaPracticalP2);
        aoaPracticalP3 = (Button) findViewById(R.id.aoaPracticalP3);
        aoaPracticalP4 = (Button) findViewById(R.id.aoaPracticalP4);

        aoaPracticalP1.setOnClickListener(this);
        aoaPracticalP2.setOnClickListener(this);
        aoaPracticalP3.setOnClickListener(this);
        aoaPracticalP4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);
    }
}

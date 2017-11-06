package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class coaPractical extends AppCompatActivity implements View.OnClickListener {

    Button coaPracticalP1, coaPracticalP2, coaPracticalP3, coaPracticalP4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coa_practical);

        coaPracticalP1 = (Button) findViewById(R.id.coaPracticalP1);
        coaPracticalP2 = (Button) findViewById(R.id.coaPracticalP2);
        coaPracticalP3 = (Button) findViewById(R.id.coaPracticalP3);
        coaPracticalP4 = (Button) findViewById(R.id.coaPracticalP4);

        coaPracticalP1.setOnClickListener(this);
        coaPracticalP2.setOnClickListener(this);
        coaPracticalP3.setOnClickListener(this);
        coaPracticalP4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);
    }
}

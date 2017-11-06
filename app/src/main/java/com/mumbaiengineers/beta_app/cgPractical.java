package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cgPractical extends AppCompatActivity implements View.OnClickListener {

    Button cgPracticalP1, cgPracticalP2, cgPracticalP3, cgPracticalP4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg_practical);

        cgPracticalP1 = (Button) findViewById(R.id.cgPracticalP1);
        cgPracticalP2 = (Button) findViewById(R.id.cgPracticalP2);
        cgPracticalP3 = (Button) findViewById(R.id.cgPracticalP3);
        cgPracticalP4 = (Button) findViewById(R.id.cgPracticalP4);

        cgPracticalP1.setOnClickListener(this);
        cgPracticalP2.setOnClickListener(this);
        cgPracticalP3.setOnClickListener(this);
        cgPracticalP4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);
    }
}

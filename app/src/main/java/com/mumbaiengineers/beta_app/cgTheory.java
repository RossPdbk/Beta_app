package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cgTheory extends AppCompatActivity implements View.OnClickListener {

    Button cgTheoryQ1,cgTheoryQ2,cgTheoryQ3,cgTheoryQ4,cgTheoryQ5,cgTheoryQ6,cgTheoryQ7,cgTheoryQ8,cgTheoryQ9,cgTheoryQ10,cgTheoryQ11,cgTheoryQ12,cgTheoryQ13,cgTheoryQ14,cgTheoryQ15,cgTheoryQ16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg_theory);

        cgTheoryQ1 = (Button) findViewById(R.id.cgTheoryQ1);
        cgTheoryQ2 = (Button) findViewById(R.id.cgTheoryQ2);
        cgTheoryQ3 = (Button) findViewById(R.id.cgTheoryQ3);
        cgTheoryQ4 = (Button) findViewById(R.id.cgTheoryQ4);
        cgTheoryQ5 = (Button) findViewById(R.id.cgTheoryQ5);
        cgTheoryQ6 = (Button) findViewById(R.id.cgTheoryQ6);
        cgTheoryQ7 = (Button) findViewById(R.id.cgTheoryQ7);
        cgTheoryQ8 = (Button) findViewById(R.id.cgTheoryQ8);
        cgTheoryQ9 = (Button) findViewById(R.id.cgTheoryQ9);
        cgTheoryQ10 = (Button) findViewById(R.id.cgTheoryQ10);
        cgTheoryQ11 = (Button) findViewById(R.id.cgTheoryQ11);
        cgTheoryQ12 = (Button) findViewById(R.id.cgTheoryQ12);
        cgTheoryQ13 = (Button) findViewById(R.id.cgTheoryQ13);
        cgTheoryQ14 = (Button) findViewById(R.id.cgTheoryQ14);
        cgTheoryQ15 = (Button) findViewById(R.id.cgTheoryQ15);
        cgTheoryQ16 = (Button) findViewById(R.id.cgTheoryQ16);


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
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);

    }
}

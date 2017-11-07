package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aoaTheory extends AppCompatActivity implements View.OnClickListener {
    Button aoaTheoryQ1, aoaTheoryQ2, aoaTheoryQ3, aoaTheoryQ4, aoaTheoryQ5, aoaTheoryQ6, aoaTheoryQ7, aoaTheoryQ8, aoaTheoryQ9, aoaTheoryQ10;
    Button aoaTheoryQ11, aoaTheoryQ12, aoaTheoryQ13, aoaTheoryQ14, aoaTheoryQ15, aoaTheoryQ16, aoaTheoryQ17, aoaTheoryQ18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aoa_theory);
        aoaTheoryQ1 = (Button) findViewById(R.id.aoaTheoryQ1);
        aoaTheoryQ2 = (Button) findViewById(R.id.aoaTheoryQ2);
        aoaTheoryQ3 = (Button) findViewById(R.id.aoaTheoryQ3);
        aoaTheoryQ4 = (Button) findViewById(R.id.aoaTheoryQ4);
        aoaTheoryQ5 = (Button) findViewById(R.id.aoaTheoryQ5);
        aoaTheoryQ6 = (Button) findViewById(R.id.aoaTheoryQ6);
        aoaTheoryQ7 = (Button) findViewById(R.id.aoaTheoryQ7);
        aoaTheoryQ8 = (Button) findViewById(R.id.aoaTheoryQ8);
        aoaTheoryQ9 = (Button) findViewById(R.id.aoaTheoryQ9);
        aoaTheoryQ10 = (Button) findViewById(R.id.aoaTheoryQ10);
        aoaTheoryQ11 = (Button) findViewById(R.id.aoaTheoryQ11);
        aoaTheoryQ12 = (Button) findViewById(R.id.aoaTheoryQ12);
        aoaTheoryQ13 = (Button) findViewById(R.id.aoaTheoryQ13);
        aoaTheoryQ14 = (Button) findViewById(R.id.aoaTheoryQ14);
        aoaTheoryQ15 = (Button) findViewById(R.id.aoaTheoryQ15);
        aoaTheoryQ16 = (Button) findViewById(R.id.aoaTheoryQ16);
        aoaTheoryQ17 = (Button) findViewById(R.id.aoaTheoryQ17);
        aoaTheoryQ18 = (Button) findViewById(R.id.aoaTheoryQ18);

        aoaTheoryQ1.setOnClickListener(this);
        aoaTheoryQ2.setOnClickListener(this);
        aoaTheoryQ3.setOnClickListener(this);
        aoaTheoryQ4.setOnClickListener(this);
        aoaTheoryQ5.setOnClickListener(this);
        aoaTheoryQ6.setOnClickListener(this);
        aoaTheoryQ7.setOnClickListener(this);
        aoaTheoryQ8.setOnClickListener(this);
        aoaTheoryQ9.setOnClickListener(this);
        aoaTheoryQ10.setOnClickListener(this);
        aoaTheoryQ11.setOnClickListener(this);
        aoaTheoryQ12.setOnClickListener(this);
        aoaTheoryQ13.setOnClickListener(this);
        aoaTheoryQ14.setOnClickListener(this);
        aoaTheoryQ15.setOnClickListener(this);
        aoaTheoryQ16.setOnClickListener(this);
        aoaTheoryQ17.setOnClickListener(this);
        aoaTheoryQ18.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);

    }
}

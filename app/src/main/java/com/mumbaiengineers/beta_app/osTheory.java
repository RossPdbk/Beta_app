package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class osTheory extends AppCompatActivity implements View.OnClickListener {
    Button osTheoryQ1,osTheoryQ2,osTheoryQ3,osTheoryQ4,osTheoryQ5,osTheoryQ6,osTheoryQ7,osTheoryQ8,osTheoryQ9,osTheoryQ10,osTheoryQ11,osTheoryQ12,
            osTheoryQ13,osTheoryQ14,osTheoryQ15,osTheoryQ16,osTheoryQ17,osTheoryQ18,osTheoryQ19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_theory);

        osTheoryQ1 = (Button) findViewById(R.id.osTheoryQ1);
        osTheoryQ2 = (Button) findViewById(R.id.osTheoryQ2);
        osTheoryQ3 = (Button) findViewById(R.id.osTheoryQ3);
        osTheoryQ4 = (Button) findViewById(R.id.osTheoryQ4);
        osTheoryQ5 = (Button) findViewById(R.id.osTheoryQ5);
        osTheoryQ6 = (Button) findViewById(R.id.osTheoryQ6);
        osTheoryQ7 = (Button) findViewById(R.id.osTheoryQ7);
        osTheoryQ8 = (Button) findViewById(R.id.osTheoryQ8);
        osTheoryQ9 = (Button) findViewById(R.id.osTheoryQ9);
        osTheoryQ10 = (Button) findViewById(R.id.osTheoryQ10);
        osTheoryQ11 = (Button) findViewById(R.id.osTheoryQ11);
        osTheoryQ12 = (Button) findViewById(R.id.osTheoryQ12);
        osTheoryQ13 = (Button) findViewById(R.id.osTheoryQ13);
        osTheoryQ14 = (Button) findViewById(R.id.osTheoryQ14);
        osTheoryQ15 = (Button) findViewById(R.id.osTheoryQ15);
        osTheoryQ16 = (Button) findViewById(R.id.osTheoryQ16);
        osTheoryQ17 = (Button) findViewById(R.id.osTheoryQ17);
        osTheoryQ18 = (Button) findViewById(R.id.osTheoryQ18);
        osTheoryQ19 = (Button) findViewById(R.id.osTheoryQ19);




        osTheoryQ1.setOnClickListener(this);
        osTheoryQ2.setOnClickListener(this);
        osTheoryQ3.setOnClickListener(this);
        osTheoryQ4.setOnClickListener(this);
        osTheoryQ5.setOnClickListener(this);
        osTheoryQ6.setOnClickListener(this);
        osTheoryQ7.setOnClickListener(this);
        osTheoryQ8.setOnClickListener(this);
        osTheoryQ9.setOnClickListener(this);
        osTheoryQ10.setOnClickListener(this);
        osTheoryQ11.setOnClickListener(this);
        osTheoryQ12.setOnClickListener(this);
        osTheoryQ13.setOnClickListener(this);
        osTheoryQ14.setOnClickListener(this);
        osTheoryQ15.setOnClickListener(this);
        osTheoryQ16.setOnClickListener(this);
        osTheoryQ17.setOnClickListener(this);
        osTheoryQ18.setOnClickListener(this);
        osTheoryQ19.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);
    }
}

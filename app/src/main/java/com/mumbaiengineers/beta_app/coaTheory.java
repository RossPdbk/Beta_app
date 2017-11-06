package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class coaTheory extends AppCompatActivity implements View.OnClickListener {
    Button coaTheoryQ1,coaTheoryQ2,coaTheoryQ3,coaTheoryQ4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coa_theory);
        coaTheoryQ1 = (Button) findViewById(R.id.coaTheoryQ1);
        coaTheoryQ2 = (Button) findViewById(R.id.coaTheoryQ2);
        coaTheoryQ3 = (Button) findViewById(R.id.coaTheoryQ3);
        coaTheoryQ4 = (Button) findViewById(R.id.coaTheoryQ4);

        coaTheoryQ1.setOnClickListener(this);
        coaTheoryQ2.setOnClickListener(this);
        coaTheoryQ3.setOnClickListener(this);
        coaTheoryQ4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);
    }
}

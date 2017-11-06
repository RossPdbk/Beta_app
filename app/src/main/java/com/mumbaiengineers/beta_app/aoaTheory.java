package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aoaTheory extends AppCompatActivity implements View.OnClickListener {
    Button aoaTheoryQ1,aoaTheoryQ2,aoaTheoryQ3,aoaTheoryQ4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aoa_theory);
        aoaTheoryQ1 = (Button) findViewById(R.id.aoaTheoryQ1);
        aoaTheoryQ2 = (Button) findViewById(R.id.aoaTheoryQ2);
        aoaTheoryQ3 = (Button) findViewById(R.id.aoaTheoryQ3);
        aoaTheoryQ4 = (Button) findViewById(R.id.aoaTheoryQ4);

        aoaTheoryQ1.setOnClickListener(this);
        aoaTheoryQ2.setOnClickListener(this);
        aoaTheoryQ3.setOnClickListener(this);
        aoaTheoryQ4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);

    }
}

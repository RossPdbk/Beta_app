package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cgTheory extends AppCompatActivity implements View.OnClickListener {

    Button cgTheoryQ1,cgTheoryQ2,cgTheoryQ3,cgTheoryQ4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg_theory);

        cgTheoryQ1 = (Button) findViewById(R.id.cgTheoryQ1);
        cgTheoryQ2 = (Button) findViewById(R.id.cgTheoryQ2);
        cgTheoryQ3 = (Button) findViewById(R.id.cgTheoryQ3);
        cgTheoryQ4 = (Button) findViewById(R.id.cgTheoryQ4);

        cgTheoryQ1.setOnClickListener(this);
        cgTheoryQ2.setOnClickListener(this);
        cgTheoryQ3.setOnClickListener(this);
        cgTheoryQ4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);

    }
}

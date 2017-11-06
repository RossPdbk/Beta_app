package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class osTheory extends AppCompatActivity implements View.OnClickListener {
    Button osTheoryQ1,osTheoryQ2,osTheoryQ3,osTheoryQ4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_theory);

        osTheoryQ1 = (Button) findViewById(R.id.osTheoryQ1);
        osTheoryQ2 = (Button) findViewById(R.id.osTheoryQ2);
        osTheoryQ3 = (Button) findViewById(R.id.osTheoryQ3);
        osTheoryQ4 = (Button) findViewById(R.id.osTheoryQ4);

        osTheoryQ1.setOnClickListener(this);
        osTheoryQ2.setOnClickListener(this);
        osTheoryQ3.setOnClickListener(this);
        osTheoryQ4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);
    }
}

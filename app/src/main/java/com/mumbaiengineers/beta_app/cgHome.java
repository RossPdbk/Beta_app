package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cgHome extends AppCompatActivity implements View.OnClickListener {
    Button cgTheory, cgPractical, cgMfaQ1, cgMfaQ2, cgMfaQ3, cgMfaQ4, cgMfaQ5, cgMfaQ6, cgMfaQ7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg_home);

        cgTheory = (Button) findViewById(R.id.cgTheory);
        cgPractical = (Button) findViewById(R.id.cgPractical);

        cgMfaQ1 = (Button) findViewById(R.id.cgTheoryQ1);
        cgMfaQ2 = (Button) findViewById(R.id.cgTheoryQ5);
        cgMfaQ3 = (Button) findViewById(R.id.cgTheoryQ8);
        cgMfaQ4 = (Button) findViewById(R.id.cgTheoryQ9);
        cgMfaQ5 = (Button) findViewById(R.id.cgTheoryQ11);
        cgMfaQ6 = (Button) findViewById(R.id.cgTheoryQ16);
        cgMfaQ7 = (Button) findViewById(R.id.cgTheoryQ14);

        cgTheory.setOnClickListener(this);
        cgPractical.setOnClickListener(this);

        cgMfaQ1.setOnClickListener(this);
        cgMfaQ2.setOnClickListener(this);
        cgMfaQ3.setOnClickListener(this);
        cgMfaQ4.setOnClickListener(this);
        cgMfaQ5.setOnClickListener(this);
        cgMfaQ6.setOnClickListener(this);
        cgMfaQ7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.cgTheory:
                Intent intent = new Intent(this, cgTheory.class);
                startActivity(intent);
                break;
            case R.id.cgPractical:
                Intent intent1 = new Intent(this, cgPractical.class);
                startActivity(intent1);
                break;

            case R.id.cgTheoryQ1:
                Intent intent2 = new Intent(this, webviewAnswer.class);
                intent2.putExtra("Qid",id);
                startActivity(intent2);
                break;

            case R.id.cgTheoryQ5:
                Intent intent3 = new Intent(this, webviewAnswer.class);
                intent3.putExtra("Qid",id);
                startActivity(intent3);
                break;

            case R.id.cgTheoryQ8:
                Intent intent4 = new Intent(this, webviewAnswer.class);
                intent4.putExtra("Qid",id);
                startActivity(intent4);
                break;

            case R.id.cgTheoryQ9:
                Intent intent5 = new Intent(this, webviewAnswer.class);
                intent5.putExtra("Qid",id);
                startActivity(intent5);
                break;

            case R.id.cgTheoryQ11:
                Intent intent6 = new Intent(this, webviewAnswer.class);
                intent6.putExtra("Qid",id);
                startActivity(intent6);
                break;

            case R.id.cgTheoryQ16:
                Intent intent7 = new Intent(this, webviewAnswer.class);
                intent7.putExtra("Qid",id);
                startActivity(intent7);
                break;

            case R.id.cgTheoryQ14:
                Intent intent8 = new Intent(this, webviewAnswer.class);
                intent8.putExtra("Qid",id);
                startActivity(intent8);
                break;
        }
    }
}

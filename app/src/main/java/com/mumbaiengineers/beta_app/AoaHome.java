package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AoaHome extends AppCompatActivity implements View.OnClickListener {

    Button aoaTheory, aoaPractical;
    TextView aoaMfaQ1, aoaMfaQ2, aoaMfaQ3, aoaMfaQ4, aoaMfaQ5, aoaMfaQ6, aoaMfaQ7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aoa_home);

        aoaTheory = (Button) findViewById(R.id.aoaTheory);
        aoaPractical = (Button) findViewById(R.id.aoaPractical);

        aoaMfaQ1 = (TextView) findViewById(R.id.aoaTheoryQ1);
        aoaMfaQ2 = (TextView) findViewById(R.id.aoaTheoryQ4);
        aoaMfaQ3 = (TextView) findViewById(R.id.aoaTheoryQ5);
        aoaMfaQ4 = (TextView) findViewById(R.id.aoaTheoryQ12);
        aoaMfaQ5 = (TextView) findViewById(R.id.aoaTheoryQ6);
        aoaMfaQ6 = (TextView) findViewById(R.id.aoaTheoryQ2);
        aoaMfaQ7 = (TextView) findViewById(R.id.aoaTheoryQ10);

        aoaTheory.setOnClickListener(this);
        aoaPractical.setOnClickListener(this);

        aoaMfaQ1.setOnClickListener(this);
        aoaMfaQ2.setOnClickListener(this);
        aoaMfaQ3.setOnClickListener(this);
        aoaMfaQ4.setOnClickListener(this);
        aoaMfaQ5.setOnClickListener(this);
        aoaMfaQ6.setOnClickListener(this);
        aoaMfaQ7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
            switch (id) {
                case R.id.aoaTheory:
                    Intent intent = new Intent(this, aoaTheory.class);
                    startActivity(intent);
                    break;
                case R.id.aoaPractical:
                    Intent intent1 = new Intent(this, aoaPractical.class);
                    startActivity(intent1);
                    break;

                case R.id.aoaTheoryQ1:
                    Intent intent2 = new Intent(this, webviewAnswer.class);
                    intent2.putExtra("Qid",id);
                    startActivity(intent2);
                    break;

                case R.id.aoaTheoryQ4:
                    Intent intent3 = new Intent(this, webviewAnswer.class);
                    intent3.putExtra("Qid",id);
                    startActivity(intent3);
                    break;

                case R.id.aoaTheoryQ5:
                    Intent intent4 = new Intent(this, webviewAnswer.class);
                    intent4.putExtra("Qid",id);
                    startActivity(intent4);
                    break;

                case R.id.aoaTheoryQ12:
                    Intent intent5 = new Intent(this, webviewAnswer.class);
                    intent5.putExtra("Qid",id);
                    startActivity(intent5);
                    break;

                case R.id.aoaTheoryQ6:
                    Intent intent6 = new Intent(this, webviewAnswer.class);
                    intent6.putExtra("Qid",id);
                    startActivity(intent6);
                    break;

                case R.id.aoaTheoryQ2:
                    Intent intent7 = new Intent(this, webviewAnswer.class);
                    intent7.putExtra("Qid",id);
                    startActivity(intent7);
                    break;

                case R.id.aoaTheoryQ10:
                    Intent intent8 = new Intent(this, webviewAnswer.class);
                    intent8.putExtra("Qid",id);
                    startActivity(intent8);
                    break;
            }
    }
}

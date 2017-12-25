package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView;

public class osHome extends AppCompatActivity implements View.OnClickListener {
    ImageView osTheory, osPractical;
    TextView osMfaQ1, osMfaQ2, osMfaQ3, osMfaQ4, osMfaQ5, osMfaQ6, osMfaQ7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_home);

        osTheory = (ImageView) findViewById(R.id.osTheory);
        osPractical = (ImageView) findViewById(R.id.osPractical);

        osMfaQ1 = (TextView) findViewById(R.id.osTheoryQ5);
        osMfaQ2 = (TextView) findViewById(R.id.osTheoryQ2);
        osMfaQ3 = (TextView) findViewById(R.id.osTheoryQ3);
        osMfaQ4 = (TextView) findViewById(R.id.osTheoryQ10);
        osMfaQ5 = (TextView) findViewById(R.id.osTheoryQ6);
        osMfaQ6 = (TextView) findViewById(R.id.osTheoryQ7);
        osMfaQ7 = (TextView) findViewById(R.id.osTheoryQ9);

        osTheory.setOnClickListener(this);
        osPractical.setOnClickListener(this);

        osMfaQ1.setOnClickListener(this);
        osMfaQ2.setOnClickListener(this);
        osMfaQ3.setOnClickListener(this);
        osMfaQ4.setOnClickListener(this);
        osMfaQ5.setOnClickListener(this);
        osMfaQ6.setOnClickListener(this);
        osMfaQ7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.osTheory:
                Intent intent = new Intent(this, osTheory.class);
                startActivity(intent);
                break;
            case R.id.osPractical:
                Intent intent1 = new Intent(this, osPractical.class);
                startActivity(intent1);
                break;

            case R.id.osTheoryQ5:
                Intent intent2 = new Intent(this, webviewAnswer.class);
                intent2.putExtra("Qid",id);
                startActivity(intent2);
                break;

            case R.id.osTheoryQ2:
                Intent intent3 = new Intent(this, webviewAnswer.class);
                intent3.putExtra("Qid",id);
                startActivity(intent3);
                break;

            case R.id.osTheoryQ3:
                Intent intent4 = new Intent(this, webviewAnswer.class);
                intent4.putExtra("Qid",id);
                startActivity(intent4);
                break;

            case R.id.osTheoryQ6:
                Intent intent5 = new Intent(this, webviewAnswer.class);
                intent5.putExtra("Qid",id);
                startActivity(intent5);
                break;

            case R.id.osTheoryQ10:
                Intent intent6 = new Intent(this, webviewAnswer.class);
                intent6.putExtra("Qid",id);
                startActivity(intent6);
                break;

            case R.id.osTheoryQ7:
                Intent intent7 = new Intent(this, webviewAnswer.class);
                intent7.putExtra("Qid",id);
                startActivity(intent7);
                break;

            case R.id.osTheoryQ9:
                Intent intent8 = new Intent(this, webviewAnswer.class);
                intent8.putExtra("Qid",id);
                startActivity(intent8);
                break;
        }
    }
}

package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class osHome extends AppCompatActivity implements View.OnClickListener {
    Button osTheory, osPractical, osMfaQ1, osMfaQ2, osMfaQ3, osMfaQ4, osMfaQ5, osMfaQ6, osMfaQ7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_home);

        osTheory = (Button) findViewById(R.id.osTheory);
        osPractical = (Button) findViewById(R.id.osPractical);

        osMfaQ1 = (Button) findViewById(R.id.osMfaQ1);
        osMfaQ2 = (Button) findViewById(R.id.osMfaQ2);
        osMfaQ3 = (Button) findViewById(R.id.osMfaQ3);
        osMfaQ4 = (Button) findViewById(R.id.osMfaQ4);
        osMfaQ5 = (Button) findViewById(R.id.osMfaQ5);
        osMfaQ6 = (Button) findViewById(R.id.osMfaQ6);
        osMfaQ7 = (Button) findViewById(R.id.osMfaQ7);

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
                Intent intent = new Intent(this, coaTheory.class);
                startActivity(intent);
                break;
            case R.id.osPractical:
                Intent intent1 = new Intent(this, coaPractical.class);
                startActivity(intent1);
                break;

            case R.id.osMfaQ1:
                Intent intent2 = new Intent(this, webviewAnswer.class);
                intent2.putExtra("Qid",id);
                startActivity(intent2);
                break;

            case R.id.osMfaQ2:
                Intent intent3 = new Intent(this, webviewAnswer.class);
                intent3.putExtra("Qid",id);
                startActivity(intent3);
                break;

            case R.id.osMfaQ3:
                Intent intent4 = new Intent(this, webviewAnswer.class);
                intent4.putExtra("Qid",id);
                startActivity(intent4);
                break;

            case R.id.osMfaQ4:
                Intent intent5 = new Intent(this, webviewAnswer.class);
                intent5.putExtra("Qid",id);
                startActivity(intent5);
                break;

            case R.id.osMfaQ5:
                Intent intent6 = new Intent(this, webviewAnswer.class);
                intent6.putExtra("Qid",id);
                startActivity(intent6);
                break;

            case R.id.osMfaQ6:
                Intent intent7 = new Intent(this, webviewAnswer.class);
                intent7.putExtra("Qid",id);
                startActivity(intent7);
                break;

            case R.id.osMfaQ7:
                Intent intent8 = new Intent(this, webviewAnswer.class);
                intent8.putExtra("Qid",id);
                startActivity(intent8);
                break;
        }
    }
}

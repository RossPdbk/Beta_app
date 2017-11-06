package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class coaHome extends AppCompatActivity implements View.OnClickListener {
    Button coaTheory, coaPractical;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coa_home);

        coaTheory = (Button) findViewById(R.id.coaTheory);
        coaPractical = (Button) findViewById(R.id.coaPractical);

        coaTheory.setOnClickListener(this);
        coaPractical.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.coaTheory:
                Intent intent = new Intent(this, coaTheory.class);
                startActivity(intent);
                break;
            case R.id.coaPractical:
                Intent intent1 = new Intent(this, coaPractical.class);
                startActivity(intent1);
                break;
        }
    }
}

package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cgHome extends AppCompatActivity implements View.OnClickListener {
    Button cgTheory, cgPractical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg_home);

        cgTheory = (Button) findViewById(R.id.cgTheory);
        cgPractical = (Button) findViewById(R.id.cgPractical);

        cgTheory.setOnClickListener(this);
        cgPractical.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cgTheory:
                Intent intent = new Intent(this, cgTheory.class);
                startActivity(intent);
                break;
            case R.id.cgPractical:
                Intent intent1 = new Intent(this, cgPractical.class);
                startActivity(intent1);
                break;
        }
    }
}

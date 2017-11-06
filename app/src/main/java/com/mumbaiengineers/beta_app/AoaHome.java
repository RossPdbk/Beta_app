package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AoaHome extends AppCompatActivity implements View.OnClickListener {

    Button aoaTheory, aoaPractical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aoa_home);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        aoaTheory = (Button) findViewById(R.id.aoaTheory);
        aoaPractical = (Button) findViewById(R.id.aoaPractical);

        aoaTheory.setOnClickListener(this);
        aoaPractical.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            switch (v.getId()) {
                case R.id.aoaTheory:
                    Intent intent = new Intent(this, aoaTheory.class);
                    startActivity(intent);
                    break;
                case R.id.aoaPractical:
                    Intent intent1 = new Intent(this, aoaPractical.class);
                    startActivity(intent1);
                    break;
            }
    }
}

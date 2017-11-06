package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class osHome extends AppCompatActivity implements View.OnClickListener {
    Button osTheory, osPractical;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_home);

        osTheory = (Button) findViewById(R.id.osTheory);
        osPractical = (Button) findViewById(R.id.osPractical);

        osTheory.setOnClickListener(this);
        osPractical.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.osTheory:
                Intent intent = new Intent(this, coaTheory.class);
                startActivity(intent);
                break;
            case R.id.osPractical:
                Intent intent1 = new Intent(this, coaPractical.class);
                startActivity(intent1);
                break;
        }
    }
}

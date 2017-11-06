package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class osPractical extends AppCompatActivity implements View.OnClickListener {

    Button osPracticalP1, osPracticalP2, osPracticalP3, osPracticalP4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_practical);

        osPracticalP1 = (Button) findViewById(R.id.osPracticalP1);
        osPracticalP2 = (Button) findViewById(R.id.osPracticalP2);
        osPracticalP3 = (Button) findViewById(R.id.osPracticalP3);
        osPracticalP4 = (Button) findViewById(R.id.osPracticalP4);

        osPracticalP1.setOnClickListener(this);
        osPracticalP2.setOnClickListener(this);
        osPracticalP3.setOnClickListener(this);
        osPracticalP4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = new Intent(this,webviewAnswer.class );
        intent.putExtra("Qid",id);
        startActivity(intent);
    }
}

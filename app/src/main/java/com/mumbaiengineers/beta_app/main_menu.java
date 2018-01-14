package com.mumbaiengineers.beta_app;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * Created by RishiShweta on 14-01-2018.
 */

public class main_menu extends AppCompatActivity implements View.OnClickListener{
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.shareid:
                Toast.makeText(this, "Share clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.feedbackid:
                Toast.makeText(this, "Feedback clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.rateid:
                Toast.makeText(this, "Rate Us clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.reportid:
                Toast.makeText(this, "Report Bug clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.aboutid:
                Toast.makeText(this, "About us clicked", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {

    }
}

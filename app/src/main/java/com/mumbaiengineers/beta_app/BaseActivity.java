package com.mumbaiengineers.beta_app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by Shubham on 14/01/2018.
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null, chooser = null;
        switch (item.getItemId()) {

            case R.id.shareid: {
                intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Get simplifies answers for your exam questions(For Second year - Computer Engineering students only).\n www.twitter.com/imRohit_18\n\nFollow him for updates");
                chooser = Intent.createChooser(intent, "Share with");
                startActivity(chooser);
                return true;
            }

            case R.id.feedbackid: {
                intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                String[] to = {"rosspdbk@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL,to);
                intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback for CampusHood app");
                intent.setType("message/rfc822");
                chooser = Intent.createChooser(intent, "SEND EMAIL");
                startActivity(chooser);
                return true;
            }

            case R.id.rateid:
                Toast.makeText(this, "Rate Us clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.reportid: {
                intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:"));
                String[] to = {"rosspdbk@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL, to);
                intent.putExtra(Intent.EXTRA_SUBJECT, "CampusHood : Bugs & Other issues");
                intent.setType("message/rfc822");
                chooser = Intent.createChooser(intent, "SEND EMAIL");
                startActivity(chooser);
                return true;
            }

            case R.id.aboutid:
                Toast.makeText(this, "About us clicked", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

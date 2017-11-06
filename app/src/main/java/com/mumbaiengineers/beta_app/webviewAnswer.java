package com.mumbaiengineers.beta_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class webviewAnswer extends AppCompatActivity {
WebView webviewAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_answer);
        webviewAnswer = (WebView) findViewById(R.id.webviewAnswer);

        Intent mintent = getIntent();
        int value = mintent.getIntExtra("Qid",0);
        switch(value) {
            //AoA cases starts here
            case R.id.aoaTheoryQ1:
                webviewAnswer.loadUrl("file:///android_asset/app/OS/Critical_section.html");
                break;
            case R.id.aoaTheoryQ2 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.aoaTheoryQ3 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.aoaTheoryQ4 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            //AoA cases ends here


            //COA cases srarts here
            case R.id.coaTheoryQ1:
                webviewAnswer.loadUrl("file:///android_asset/app/OS/Critical_section.html");
                break;
            case R.id.coaTheoryQ2 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.coaTheoryQ3 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.coaTheoryQ4 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            //CoA cases ends here


            //OS cases srarts here
            case R.id.osTheoryQ1:
                webviewAnswer.loadUrl("file:///android_asset/app/OS/Critical_section.html");
                break;
            case R.id.osTheoryQ2 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.osTheoryQ3 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.osTheoryQ4 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            //OS cases ends here



            //CG cases srarts here
            case R.id.cgTheoryQ1:
                webviewAnswer.loadUrl("file:///android_asset/app/OS/Critical_section.html");
                break;
            case R.id.cgTheoryQ2 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.cgTheoryQ3 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.cgTheoryQ4 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            //CG cases ends here

            //Practical Qustions
            //AOA Prac starts here
            case R.id.aoaPracticalP1:
                webviewAnswer.loadUrl("file:///android_asset/app/OS/Critical_section.html");
                break;
            case R.id.aoaPracticalP2 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.aoaPracticalP3 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.aoaPracticalP4 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            //AOA Prac ends here

            //COA Prac starts here
            case R.id.coaPracticalP1:
                webviewAnswer.loadUrl("file:///android_asset/app/OS/Critical_section.html");
                break;
            case R.id.coaPracticalP2 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.coaPracticalP3 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.coaPracticalP4 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            //COA Prac ends here

            //OS Prac starts here
            case R.id.osPracticalP1:
                webviewAnswer.loadUrl("file:///android_asset/app/OS/Critical_section.html");
                break;
            case R.id.osPracticalP2 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.osPracticalP3 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.osPracticalP4 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            //OS Prac ends here

            //CG Prac starts here
            case R.id.cgPracticalP1:
                webviewAnswer.loadUrl("file:///android_asset/app/OS/Critical_section.html");
                break;
            case R.id.cgPracticalP2 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.cgPracticalP3 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.cgPracticalP4 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            //CG Prac ends here

        }
    }
}

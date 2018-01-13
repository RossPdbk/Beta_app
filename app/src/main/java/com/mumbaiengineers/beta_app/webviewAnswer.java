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

        webviewAnswer.getSettings().setDisplayZoomControls(false);
        webviewAnswer.getSettings().setBuiltInZoomControls(true);

        Intent mintent = getIntent();
        int value = mintent.getIntExtra("Qid",0);
        switch(value) {
            //AoA cases starts here
            case R.id.aoaTheoryQ1:
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ1.html");
                break;
            case R.id.aoaTheoryQ2 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ2.html");
                break;
            case R.id.aoaTheoryQ3 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ3.html");
                break;
            case R.id.aoaTheoryQ4 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ4.html");
                break;
            case R.id.aoaTheoryQ5:
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ5.html");
                break;
            case R.id.aoaTheoryQ6 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ6.html");
                break;
            case R.id.aoaTheoryQ7 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ7.html");
                break;
            case R.id.aoaTheoryQ8 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ8.html");
                break;
            case R.id.aoaTheoryQ9:
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ9.html");
                break;
            case R.id.aoaTheoryQ10 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ10.html");
                break;
            case R.id.aoaTheoryQ11:
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ11.html");
                break;
            case R.id.aoaTheoryQ12:
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ12.html");
                break;
            case R.id.aoaTheoryQ13:
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ13.html");
                break;
            case R.id.aoaTheoryQ14:
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ14.html");
                break;
            case R.id.aoaTheoryQ15:
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ15.html");
                break;
            case R.id.aoaTheoryQ16:
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ16.html");
                break;
            case R.id.aoaTheoryQ17:
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ17.html");
                break;
            case R.id.aoaTheoryQ18:
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ18.html");
                break;
            case R.id.aoaTheoryQ19:
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ19.html");
                break;
            case R.id.aoaTheoryQ20:
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ20.html");
                break;
            case R.id.aoaTheoryQ21:
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ21.html");
                break;
            case R.id.aoaTheoryQ22:
                webviewAnswer.loadUrl("file:///android_asset/aoa/AOAQ22.html");
                break;

            //AoA cases ends here




            //COA cases srarts here
            case R.id.coaTheoryQ1:
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ1.html");
                break;
            case R.id.coaTheoryQ2 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ2.html");
                break;
            case R.id.coaTheoryQ3 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ3.html");
                break;
            case R.id.coaTheoryQ4 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ4.html");
                break;
            case R.id.coaTheoryQ5 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ5.html");
                break;
            case R.id.coaTheoryQ6 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ6.html");
                break;

            case R.id.coaTheoryQ7 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ7.html");
                break;

            case R.id.coaTheoryQ8 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ8.html");
                break;

            case R.id.coaTheoryQ9 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ9.html");
                break;

            case R.id.coaTheoryQ10 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ10.html");
                break;

            case R.id.coaTheoryQ11 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ11.html");
                break;

            case R.id.coaTheoryQ12 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ12.html");
                break;

            case R.id.coaTheoryQ13 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ13.html");
                break;

            case R.id.coaTheoryQ14:
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ14.html");
                break;

            case R.id.coaTheoryQ15:
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ15.html");
                break;

            case R.id.coaTheoryQ16 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ16.html");
                break;

            case R.id.coaTheoryQ17:
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ17.html");
                break;

            case R.id.coaTheoryQ18 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ18.html");
                break;

            case R.id.coaTheoryQ19:
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ19.html");
                break;

            case R.id.coaTheoryQ20 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ20.html");
                break;

            case R.id.coaTheoryQ21 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ21.html");
                break;

            case R.id.coaTheoryQ22 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ22.html");
                break;
            case R.id.coaTheoryQ23 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ23.html");
                break;
            case R.id.coaTheoryQ24 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ24.html");
                break;
            case R.id.coaTheoryQ25 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ25.html");
                break;
            case R.id.coaTheoryQ26 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ26.html");
                break;
            case R.id.coaTheoryQ27 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ27.html");
                break;
            case R.id.coaTheoryQ28 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ28.html");
                break;
            case R.id.coaTheoryQ29 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ29.html");
                break;
            case R.id.coaTheoryQ30 :
                webviewAnswer.loadUrl("file:///android_asset/COA/coaQ30.html");
                break;

            //CoA cases ends here




            //OS cases srarts here
            case R.id.osTheoryQ1:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ1.html");
                break;
            case R.id.osTheoryQ2 :
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ2.html");
                break;
            case R.id.osTheoryQ3 :
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ3.html");
                break;
            case R.id.osTheoryQ4 :
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ4.html");
                break;
            case R.id.osTheoryQ5:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ5.html");
                break;
            case R.id.osTheoryQ6 :
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ6.html");
                break;
            case R.id.osTheoryQ7 :
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ7.html");
                break;
            case R.id.osTheoryQ8 :
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ8.html");
                break;
            case R.id.osTheoryQ9:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ9.html");
                break;
            case R.id.osTheoryQ10 :
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ10.html");
                break;
            case R.id.osTheoryQ11:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ11.html");
                break;
            case R.id.osTheoryQ12:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ12.html");
                break;
            case R.id.osTheoryQ13:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ13.html");
                break;
            case R.id.osTheoryQ14:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ14.html");
                break;
            case R.id.osTheoryQ15:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ15.html");
                break;
            case R.id.osTheoryQ16:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ16.html");
                break;
            case R.id.osTheoryQ17:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ17.html");
                break;
            case R.id.osTheoryQ18:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ18.html");
                break;
            case R.id.osTheoryQ19:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ19.html");
                break;
            case R.id.osTheoryQ20:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ20.html");
                break;
            case R.id.osTheoryQ21:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ21.html");
                break;
            case R.id.osTheoryQ22:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ22.html");
                break;
            case R.id.osTheoryQ23:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ23.html");
                break;
            case R.id.osTheoryQ24:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ24.html");
                break;

            case R.id.osTheoryQ25:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ25.html");
                break;

            case R.id.osTheoryQ26:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ26.html");
                break;

            case R.id.osTheoryQ27:
                webviewAnswer.loadUrl("file:///android_asset/OS/OSQ27.html");
                break;


            //OS cases ends here





            //CG cases srarts here
            case R.id.cgTheoryQ1:
                webviewAnswer.loadUrl("file:///android_asset/cg/que1.html");
                break;
            case R.id.cgTheoryQ2 :
                webviewAnswer.loadUrl("file:///android_asset/cg/que2.html");
                break;
            case R.id.cgTheoryQ3 :
                webviewAnswer.loadUrl("file:///android_asset/cg/q3.html");
                break;
            case R.id.cgTheoryQ4 :
                webviewAnswer.loadUrl("file:///android_asset/cg/q4.html");
                break;
            case R.id.cgTheoryQ5 :
                webviewAnswer.loadUrl("file:///android_asset/cg/q5.html");
                break;
            case R.id.cgTheoryQ6 :
                webviewAnswer.loadUrl("file:///android_asset/cg/q6.html");
                break;
            case R.id.cgTheoryQ7 :
                webviewAnswer.loadUrl("file:///android_asset/cg/q7.html");
                break;
            case R.id.cgTheoryQ8 :
                webviewAnswer.loadUrl("file:///android_asset/cg/q10.html");
                break;
            case R.id.cgTheoryQ9 :
                webviewAnswer.loadUrl("file:///android_asset/cg/q9.html");
                break;
            case R.id.cgTheoryQ10 :
                webviewAnswer.loadUrl("file:///android_asset/cg/q14.html");
                break;
            case R.id.cgTheoryQ11 :
                webviewAnswer.loadUrl("file:///android_asset/cg/q8.html");
                break;
            case R.id.cgTheoryQ12 :
                webviewAnswer.loadUrl("file:///android_asset/cg/q12.html");
                break;
            case R.id.cgTheoryQ13 :
                webviewAnswer.loadUrl("file:///android_asset/cg/q16.html");
                break;
            case R.id.cgTheoryQ14 :
                webviewAnswer.loadUrl("file:///android_asset/cg/q11.html");
                break;
            case R.id.cgTheoryQ15 :
                webviewAnswer.loadUrl("file:///android_asset/cg/q13.html");
                break;
            case R.id.cgTheoryQ16 :
                webviewAnswer.loadUrl("file:///android_asset/cg/q15.html");
                break;
            case R.id.cgTheoryQ17 :
                webviewAnswer.loadUrl("file:///android_asset/cg/q17.html");
                break;
            case R.id.cgTheoryQ18 :
                webviewAnswer.loadUrl("file:///android_asset/cg/q18.html");
                break;
            //CG cases ends here



            //Practical Qustions

            //AOA Prac starts here
            case R.id.aoaPracticalP1:
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac01.html");
                break;
            case R.id.aoaPracticalP2 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac02.html");
                break;
            case R.id.aoaPracticalP3 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac03.html");
                break;
            case R.id.aoaPracticalP4 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac04.html");
                break;
            case R.id.aoaPracticalP5 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac05.html");
                break;
            case R.id.aoaPracticalP6 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac06.html");
                break;
            case R.id.aoaPracticalP7 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac07.html");
                break;
            case R.id.aoaPracticalP8 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac08.html");
                break;
            case R.id.aoaPracticalP9 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac09.html");
                break;
            case R.id.aoaPracticalP10 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac10.html");
                break;
            case R.id.aoaPracticalP11 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac11.html");
                break;
            case R.id.aoaPracticalP12 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac12.html");
                break;
            case R.id.aoaPracticalP13 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac13.html");
                break;
            case R.id.aoaPracticalP14 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac14.html");
                break;
            case R.id.aoaPracticalP15 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac15.html");
                break;
            case R.id.aoaPracticalP16 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac16.html");
                break;
            case R.id.aoaPracticalP17 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac17.html");
                break;
            case R.id.aoaPracticalP18 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac18.html");
                break;
            case R.id.aoaPracticalP19 :
                webviewAnswer.loadUrl("file:///android_asset/aoa/aoaPrac19.html");
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
                webviewAnswer.loadUrl("file:///android_asset/OS/OSP1.html");
                break;
            case R.id.osPracticalP2 :
                webviewAnswer.loadUrl("file:///android_asset/OS/OSP2.html");
                break;
            case R.id.osPracticalP3 :
                webviewAnswer.loadUrl("file:///android_asset/OS/OSP3.html");
                break;
            case R.id.osPracticalP4 :
                webviewAnswer.loadUrl("file:///android_asset/OS/OSP4.html");
                break;
            case R.id.osPracticalP5 :
                webviewAnswer.loadUrl("file:///android_asset/OS/OSP5.html");
                break;
            case R.id.osPracticalP6 :
                webviewAnswer.loadUrl("file:///android_asset/OS/OSP6.html");
                break;
            case R.id.osPracticalP7 :
                webviewAnswer.loadUrl("file:///android_asset/OS/OSP7.html");
                break;
            case R.id.osPracticalP8 :
                webviewAnswer.loadUrl("file:///android_asset/OS/OSP8.html");
                break;
            case R.id.osPracticalP9 :
                webviewAnswer.loadUrl("file:///android_asset/OS/OSP9.html");
                break;
            case R.id.osPracticalP10 :
                webviewAnswer.loadUrl("file:///android_asset/OS/OSP10.html");
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

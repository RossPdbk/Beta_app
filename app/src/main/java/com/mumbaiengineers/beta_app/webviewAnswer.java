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
            case (R.id.aoaTheoryQ1):
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



            //AOA MFA starts here
           // case R.id.aoaMfaQ1:
            //    webviewAnswer.loadUrl("file:///android_asset/app/OS/Critical_section.html");
             //   break;
            case R.id.aoaMfaQ2 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.aoaMfaQ3 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.aoaMfaQ4 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.aoaMfaQ5 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.aoaMfaQ6 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.aoaMfaQ7 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            //AOA MFA ends here


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

            //COA MFA starts here
            case R.id.coaMfaQ1:
                webviewAnswer.loadUrl("file:///android_asset/app/OS/Critical_section.html");
                break;
            case R.id.coaMfaQ2 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.coaMfaQ3 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.coaMfaQ4 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.coaMfaQ5 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.coaMfaQ6 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.coaMfaQ7 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            //COA MFA ends here


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

            //OS MFA starts here
            case R.id.osMfaQ1:
                webviewAnswer.loadUrl("file:///android_asset/app/OS/Critical_section.html");
                break;
            case R.id.osMfaQ2 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.osMfaQ3 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.osMfaQ4 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.osMfaQ5 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.osMfaQ6 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.osMfaQ7 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            //OS MFA ends here



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
            //CG cases ends here

            //CG MFA starts here
            case R.id.cgMfaQ1:
                webviewAnswer.loadUrl("file:///android_asset/app/OS/Critical_section.html");
                break;
            case R.id.cgMfaQ2 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.cgMfaQ3 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.cgMfaQ4 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.cgMfaQ5 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.cgMfaQ6 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            case R.id.cgMfaQ7 :
                webviewAnswer.loadUrl("file:///android_asset/app/COA/Theory/booth.html");
                break;
            //CG MFA ends here



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

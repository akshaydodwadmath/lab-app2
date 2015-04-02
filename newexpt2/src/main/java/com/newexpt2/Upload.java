package com.newexpt2;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

public class Upload extends Activity {

	 

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        try{
        	Intent localIntent = new Intent("android.intent.action.VIEW");
            localIntent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
            localIntent.setData(Uri.parse("http://192.168.40.208/html/physics/upload.html"));
            startActivity(localIntent);
            }
	    catch(Exception e)
        {
        	Toast.makeText(getApplicationContext(),"Error", Toast.LENGTH_LONG);
        }
    }

       
	
	
}

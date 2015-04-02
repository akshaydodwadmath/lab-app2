package com.front;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class cs1 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cs1);
        WebView a = (WebView)findViewById(R.id.webview1);
        a.loadUrl("file:///android_asset/cs/cs1.html");
        Button obs=(Button)findViewById(R.id.button1);
        
        obs.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub\
				
				Intent i=new Intent(getApplicationContext(), csd1.class);
				startActivity(i);
				
			}
		});
        
        
    }
}

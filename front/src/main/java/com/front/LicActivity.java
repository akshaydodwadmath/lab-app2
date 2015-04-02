package com.front;

//import com..exp5.R;
//import com.ec.exp5.ec_exp5_tab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class LicActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);
        WebView a = (WebView)findViewById(R.id.webview1);
        a.loadUrl("file:///android_asset/inverter.html");
        Button obs=(Button)findViewById(R.id.button1);
        Button obs2=(Button)findViewById(R.id.button2);
        
        obs.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub\
				
				Intent i=new Intent(getApplicationContext(), design3.class);
				startActivity(i);
				
			}
			
			
			
		});
        
        obs2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub\
				
				Intent i=new Intent(getApplicationContext(), design4.class);
				startActivity(i);
				
			}
        });
    }}
        
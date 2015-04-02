
package com.front;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class cs2 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cs2);
        WebView a = (WebView)findViewById(R.id.webview1);
        a.loadUrl("file:///android_asset/cs/cs2.html");
        Button obs=(Button)findViewById(R.id.button1);
        Button tab1=(Button)findViewById(R.id.button2);
    //    Button tab2=(Button)findViewById(R.id.button3);
        obs.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub\
				
				Intent i=new Intent(getApplicationContext(), csd2.class);
				startActivity(i);
				
			}
		});
        
        tab1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(), cst2.class);
				startActivity(i);
			}
		});
        
  
        
    }
}
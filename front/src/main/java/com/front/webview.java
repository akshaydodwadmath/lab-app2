
package com.front;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class webview extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview2);
        WebView a = (WebView)findViewById(R.id.webview1);
        a.loadUrl("file:///android_asset/Untitled-2.html");
        Button obs=(Button)findViewById(R.id.button1);
        Button tab=(Button)findViewById(R.id.button2);
        
       obs.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub\
				
				Intent i=new Intent(getApplicationContext(), tabulation2.class);
				startActivity(i);
				
			}
		});
       
       tab.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent i =new Intent(getApplicationContext(),design2.class);
			startActivity(i);
		}
	});
        
        
    }
}

package com.front;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class theory2 extends Activity {
    /** Called when the activity is first created. */
   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview11);
        WebView a = (WebView)findViewById(R.id.webview1);
        a.loadUrl("file:///android_asset/Untitled-3.html");
        Button obs=(Button)findViewById(R.id.button1);
        Button tab=(Button)findViewById(R.id.button2);
        obs.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub\
				
				Intent i=new Intent(getApplicationContext(), design11.class);
				startActivity(i);
				
			}
		});
        
        tab.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(), tabulaton11.class);
				startActivity(i);
			}
		});
        
    }
}
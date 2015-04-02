
package com.front;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class ex1 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        WebView a = (WebView)findViewById(R.id.webview1);
        a.loadUrl("file:///android_asset/Untitled-1.html");
        Button intg=(Button)findViewById(R.id.button1);
        Button diff=(Button)findViewById(R.id.button2);
        
        intg.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(), intgt.class);
				startActivity(i);
				
			}
		});
        
        
  diff.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub\
				
				Intent i=new Intent(getApplicationContext(), difft.class);
				startActivity(i);
				
			}
		});
        
    }
}

package com.front;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class w2 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.w2);
        WebView a = (WebView)findViewById(R.id.webview1);
        a.loadUrl("file:///android_asset/bode2.html");
        
        
     
    
        
        
    }
}
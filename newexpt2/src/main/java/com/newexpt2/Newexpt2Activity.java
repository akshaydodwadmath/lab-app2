package com.newexpt2;




import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class  Newexpt2Activity extends Activity {
    /** Called when the activity is first created. */
  
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        SharedPreferences set=getSharedPreferences("LOGIN", 0);
        final SharedPreferences.Editor edit=set.edit();
        
        final EditText e1=(EditText)findViewById(R.id.r1);
        final EditText e2=(EditText)findViewById(R.id.r2);
        
        Button b1=(Button)findViewById(R.id.b1);
        Button b2=(Button)findViewById(R.id.b2);
        
        b2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
				
			}
		});
        
        b1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				try
				{
					int d1=Integer.parseInt(e1.getText().toString());
					int d2=Integer.parseInt(e2.getText().toString());
					
					if(d1==d2 && d1!=0)
					{
						edit.putString("rollno",d1+"");
	                    edit.commit();
						
						Intent i=new Intent(getApplicationContext(), webview.class);
						finish();
						startActivity(i);
					}
					
					else
					{
						Toast.makeText(getApplicationContext(),"Invalid Details",2000).show();
						e1.setText("");
						e2.setText("");
					}
				}
				catch(Exception e)
				{
					Toast.makeText(getApplicationContext(),"Fill all Details",2000).show();
				}
				
			}
		});
        
        
    }
}
package com.front;

import com.front.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class design6 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design6);
        final EditText e1=(EditText)findViewById(R.id.editText1);
        final EditText e2=(EditText)findViewById(R.id.editText2);
        final EditText e3=(EditText)findViewById(R.id.editText3);
        final TextView t1=(TextView)findViewById(R.id.textView5);
        final TextView t2=(TextView)findViewById(R.id.textView8);
        final TextView t3=(TextView)findViewById(R.id.textView11);
        final Button b1=(Button)findViewById(R.id.button1);
        final Button b2=(Button)findViewById(R.id.button2);
        final Button b3=(Button)findViewById(R.id.button3);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        e2.setVisibility(View.INVISIBLE);
        e3.setVisibility(View.INVISIBLE);
        
TextWatcher tw=new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				
				
				if (e1.length()>0)
				{
					e2.setVisibility(View.VISIBLE);
				}
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				
			}
		};
		e1.addTextChangedListener(tw);
		
TextWatcher tw2=new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				
				
				if (e1.length()>0 && e2.length()>0)
				{
					b1.setEnabled(true);
					e3.setVisibility(View.VISIBLE);
				}
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				
			}
		};
		e2.addTextChangedListener(tw2);
	
		
		b1.setOnClickListener(new OnClickListener() {
        	public void onClick(View arg0) {
				// TODO Auto-generated method stub
        	try {
				Double a = null,b = null,c,d,e,f,g;
				a= Double.parseDouble(e1.getText().toString());
				b= Double.parseDouble(e2.getText().toString());
				c= (2*b)/a;
				d= (10*a)/b;
				t1.setText(c+"");
				t3.setText(d+"");
			
				
			} catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(getApplicationContext(), "enter the details", 500).show();
}
			
			}
		});
        	

    TextWatcher tw3=new TextWatcher() {
    			
    			@Override
    			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
    				
    				
    				if (e3.length()>0)
    				{
    					b2.setEnabled(true);
    					b3.setEnabled(true);
    				}
    				// TODO Auto-generated method stub
    				
    			}
    			
    			@Override
    			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
    					int arg3) {
    				// TODO Auto-generated method stub
    				
    			}
    			
    			@Override
    			public void afterTextChanged(Editable arg0) {
    				// TODO Auto-generated method stub
    				
    			}
    		};
    		e3.addTextChangedListener(tw3);
    		
    		b2.setOnClickListener(new OnClickListener() {
            	public void onClick(View arg0) {
    				// TODO Auto-generated method stub
            	try {
    				Double a = null,b = null,c,d,e,f,g;
    				a= Double.parseDouble(e3.getText().toString());
    				c= a/2;
    				t2.setText(c+"");
    				
    				
    			} catch (Exception e) {
    				// TODO: handle exception
    				Toast.makeText(getApplicationContext(), "enter the details", 500).show();
    			}
    			
    			}
    		
    			
    		}); 
    		
            b3.setOnClickListener(new OnClickListener() {
    			
    			@Override
    			public void onClick(View arg0) {
    				// TODO Auto-generated method stub\
    				
    				Intent i=new Intent(getApplicationContext(), tabulation6.class);
    				startActivity(i);
    			}
    		});
            
        }
    }

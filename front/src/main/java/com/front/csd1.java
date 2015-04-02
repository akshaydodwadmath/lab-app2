package com.front;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Math;
import java.math.MathContext;



public class csd1 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.csd1);
        final Button obs=(Button)findViewById(R.id.button1);
        final EditText e1=(EditText)findViewById(R.id.editText1);
        final EditText e2=(EditText)findViewById(R.id.editText2);
        final EditText e3=(EditText)findViewById(R.id.editText3);
        final TextView t1=(TextView)findViewById(R.id.textView5);
        final TextView t2=(TextView)findViewById(R.id.textView9);
        final TextView t3=(TextView)findViewById(R.id.textView10);
        final TextView t4=(TextView)findViewById(R.id.textView11);
        final Button b1=(Button)findViewById(R.id.button2);
        final TextView t5=(TextView)findViewById(R.id.textView19);
        final TextView t6=(TextView)findViewById(R.id.textView16);
        final EditText e4=(EditText)findViewById(R.id.editText4);
        
        
        obs.setEnabled(false);
        b1.setEnabled(false);
        e2.setVisibility(View.INVISIBLE);
        e3.setVisibility(View.INVISIBLE);
     //   e4.setVisibility(View.INVISIBLE);
        
        
        
TextWatcher tw=new TextWatcher() {
			
			
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				
				
				if (e1.length()>0)
				{
					e2.setVisibility(View.VISIBLE);
					
				}
				// TODO Auto-generated method stub
				
			}
			
		
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				
			}
			
			
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				
			}
		};
		e1.addTextChangedListener(tw);
		
            TextWatcher tw2=new TextWatcher() {
			
			
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				
				
				if (e2.length()>0)
				{
					e3.setVisibility(View.VISIBLE);
				}
				// TODO Auto-generated method stub
				
			}
			
		
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				
			}
			
			
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				
			}
		};
		e2.addTextChangedListener(tw2);
		
            TextWatcher tw3=new TextWatcher() {
			
			
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				
				
				if (e3.length()>0)
				{
					b1.setEnabled(true);
					obs.setEnabled(true);
					//obs.setEnabled(true);
			//		e4.setVisibility(View.VISIBLE);
				}
				// TODO Auto-generated method stub
				
			}
			
		
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				
			}
			
			
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				
			}
		};
		e3.addTextChangedListener(tw3);
		
           TextWatcher tw4=new TextWatcher() {
			
			
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				
				
				if (e4.length()>0 )
				{
					obs.setEnabled(true);
					b1.setEnabled(true);
				}
				// TODO Auto-generated method stub
				
			}
			
		
			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				
			}
			
			
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				
			}
		};
		e4.addTextChangedListener(tw4);
           
		
		obs.setOnClickListener(new OnClickListener() {
        	public void onClick(View arg0) {
				// TODO Auto-generated method stub
        	try {
				double a = 0;
				double b = 0;
				double c= 0 ; 
				double d,e,f,g, h,i,j,k,l;
				a= Double.parseDouble(e1.getText().toString());
				b= Double.parseDouble(e2.getText().toString());
				c= Double.parseDouble(e3.getText().toString());
			//	h= Double.parseDouble(e4.getText().toString());
				
				d= (2 * a)/(b / c);
				t1.setText(d+"");
				e=(((3.412-((1-a)*(1-a)))/(a))/((1*((1-a)*(1-a)))/(b*c)));
				t2.setText(e+"");
				f=((3.412*a)/(1-(a*a*100)));
				t3.setText(f+"");
				g=(4/(a*(1/(26.45*1000000))));
				t4.setText(g+"");
		//		i= (2 * h)/(b / c);

				t5.setText(d+"");
				j= (2 * 1)/(b / c);
				t6.setText(d+"");
				
			} catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(getApplicationContext(), "enter the details", 500).show();
			}
			
			}
		
			
		});
		
		b1.setOnClickListener(new OnClickListener() {
        	public void onClick(View arg0) {
				// TODO Auto-generated method stub
        	try {
        		Intent i=new Intent(getApplicationContext(), cst1.class);
				finish();
				startActivity(i);
				
			} catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(getApplicationContext(), "enter the details", 500).show();
			}
			
			}
		
			
		});
        
        
    }
}


package com.front;

import com.newexpt2.Newexpt2Activity;
import com.newexpt2.tabulation2;



import android.R.color;
import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FrontActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button b1 =(Button)findViewById(R.id.button2);
        Button b2 =(Button)findViewById(R.id.button3);
        final Button b3=(Button)findViewById(R.id.button1);
        
        Button b4 =(Button)findViewById(R.id.button4);
        Button b5 =(Button)findViewById(R.id.button5);
        final Button b6=(Button)findViewById(R.id.Button01);
        
        final TextView t1=(TextView)findViewById(R.id.textView4);
        final TextView t2=(TextView)findViewById(R.id.textView6);
        final TextView t3=(TextView)findViewById(R.id.textView2);
        final TextView t4=(TextView)findViewById(R.id.textView5);
        final TextView t5=(TextView)findViewById(R.id.textView7);
        final TextView t6=(TextView)findViewById(R.id.textView3);
        
        final TextView t11=(TextView)findViewById(R.id.textView1);
        final TextView t12=(TextView)findViewById(R.id.TextView03);
        final TextView t13=(TextView)findViewById(R.id.textView9);
        final TextView t14=(TextView)findViewById(R.id.textView8);
        
        t1.setTextColor(Color.parseColor("#ffffff"));
        t2.setTextColor(Color.parseColor("#4e4747"));
        t3.setTextColor(Color.parseColor("#4e4747"));
        t4.setTextColor(Color.parseColor("#4e4747"));
        t5.setTextColor(Color.parseColor("#4e4747"));
        t6.setTextColor(Color.parseColor("#4e4747"));
        b3.setText(t1.getText().toString());


        t11.setTextColor(Color.parseColor("#ffffff"));
        t12.setTextColor(Color.parseColor("#4e4747"));
        t13.setTextColor(Color.parseColor("#4e4747"));
        t14.setTextColor(Color.parseColor("#4e4747"));
        b6.setText(t1.getText().toString());
        
        
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(t1.getCurrentTextColor() == Color.WHITE)
				{
					  t1.setTextColor(Color.parseColor("#4e4747"));
				        t2.setTextColor(Color.parseColor("#ffffff"));
				        t3.setTextColor(Color.parseColor("#4e4747"));
				        t4.setTextColor(Color.parseColor("#4e4747"));
				        t5.setTextColor(Color.parseColor("#4e4747"));
				        t6.setTextColor(Color.parseColor("#4e4747"));
				        b3.setText(t2.getText().toString());
				}
				
				else if(t2.getCurrentTextColor() == Color.WHITE)
				{
					  t1.setTextColor(Color.parseColor("#4e4747"));
				        t3.setTextColor(Color.parseColor("#ffffff"));
				        t2.setTextColor(Color.parseColor("#4e4747"));
				        t4.setTextColor(Color.parseColor("#4e4747"));
				        t5.setTextColor(Color.parseColor("#4e4747"));
				        t6.setTextColor(Color.parseColor("#4e4747"));
				        b3.setText(t3.getText().toString());
				}
				
				else if(t3.getCurrentTextColor() == Color.WHITE)
				{
					  t1.setTextColor(Color.parseColor("#4e4747"));
				        t4.setTextColor(Color.parseColor("#ffffff"));
				        t3.setTextColor(Color.parseColor("#4e4747"));
				        t2.setTextColor(Color.parseColor("#4e4747"));
				        t5.setTextColor(Color.parseColor("#4e4747"));
				        t6.setTextColor(Color.parseColor("#4e4747"));
				        b3.setText(t4.getText().toString());
				}
				
				else if(t4.getCurrentTextColor() == Color.WHITE)
				{
					  t1.setTextColor(Color.parseColor("#4e4747"));
				        t5.setTextColor(Color.parseColor("#ffffff"));
				        t3.setTextColor(Color.parseColor("#4e4747"));
				        t4.setTextColor(Color.parseColor("#4e4747"));
				        t2.setTextColor(Color.parseColor("#4e4747"));
				        t6.setTextColor(Color.parseColor("#4e4747"));
				        b3.setText(t5.getText().toString());
				}
				
				else if(t5.getCurrentTextColor() == Color.WHITE)
				{
					  t1.setTextColor(Color.parseColor("#4e4747"));
				        t6.setTextColor(Color.parseColor("#ffffff"));
				        t3.setTextColor(Color.parseColor("#4e4747"));
				        t4.setTextColor(Color.parseColor("#4e4747"));
				        t5.setTextColor(Color.parseColor("#4e4747"));
				        t2.setTextColor(Color.parseColor("#4e4747"));
				        b3.setText(t6.getText().toString());
				}
				
				else if(t6.getCurrentTextColor() == Color.WHITE)
				{
					  t2.setTextColor(Color.parseColor("#4e4747"));
				        t1.setTextColor(Color.parseColor("#ffffff"));
				        t3.setTextColor(Color.parseColor("#4e4747"));
				        t4.setTextColor(Color.parseColor("#4e4747"));
				        t5.setTextColor(Color.parseColor("#4e4747"));
				        t6.setTextColor(Color.parseColor("#4e4747"));
				        b3.setText(t1.getText().toString());
				}
			}
		});
        
        b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(t11.getCurrentTextColor() == Color.WHITE)
				{
					  t11.setTextColor(Color.parseColor("#4e4747"));
				        t12.setTextColor(Color.parseColor("#ffffff"));
				        t13.setTextColor(Color.parseColor("#4e4747"));
				        t14.setTextColor(Color.parseColor("#4e4747"));
				       
				        b6.setText(t2.getText().toString());
				}
				
				else if(t12.getCurrentTextColor() == Color.WHITE)
				{
					  t11.setTextColor(Color.parseColor("#4e4747"));
				        t13.setTextColor(Color.parseColor("#ffffff"));
				        t12.setTextColor(Color.parseColor("#4e4747"));
				        t14.setTextColor(Color.parseColor("#4e4747"));
				        //t5.setTextColor(Color.parseColor("#4e4747"));
				        //t6.setTextColor(Color.parseColor("#4e4747"));
				        b6.setText(t3.getText().toString());
				}
				
				else if(t13.getCurrentTextColor() == Color.WHITE)
				{
					  t11.setTextColor(Color.parseColor("#4e4747"));
				        t14.setTextColor(Color.parseColor("#ffffff"));
				        t13.setTextColor(Color.parseColor("#4e4747"));
				        t12.setTextColor(Color.parseColor("#4e4747"));
				        //t5.setTextColor(Color.parseColor("#4e4747"));
				       // t6.setTextColor(Color.parseColor("#4e4747"));
				        b6.setText(t4.getText().toString());
				}
				
				else if(t14.getCurrentTextColor() == Color.WHITE)
				{
					//  t11.setTextColor(Color.parseColor("#4e4747"));
				        t11.setTextColor(Color.parseColor("#ffffff"));
				        t13.setTextColor(Color.parseColor("#4e4747"));
				        t14.setTextColor(Color.parseColor("#4e4747"));
				        t12.setTextColor(Color.parseColor("#4e4747"));
				       // t6.setTextColor(Color.parseColor("#4e4747"));
				        b6.setText(t5.getText().toString());
				}
				
				
			}
		});
        
        
        b2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if(t1.getCurrentTextColor() == Color.WHITE)
				{
					Intent i=new Intent(getApplicationContext(), ex1.class);
				startActivity(i);
				}
				else if(t2.getCurrentTextColor() == Color.WHITE)
				{
					Intent i=new Intent(getApplicationContext(), webview.class);
					startActivity(i);
				}
				
				else if(t3.getCurrentTextColor() == Color.WHITE)
				{
					Intent i=new Intent(getApplicationContext(), LicActivity.class);
					startActivity(i);
				}
				
				else if(t4.getCurrentTextColor() == Color.WHITE)
				{
					Intent i=new Intent(getApplicationContext(), LictwoActivity.class);
					startActivity(i);
				}
				
				else if(t5.getCurrentTextColor() == Color.WHITE)
				{
					Intent i=new Intent(getApplicationContext(), theory.class);
					startActivity(i);
				}
				
				else if(t6.getCurrentTextColor() == Color.WHITE)
				{
					Intent i=new Intent(getApplicationContext(), theory2.class);
					startActivity(i);
				}
				
			}
		});
        
        
        b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				if(t11.getCurrentTextColor() == Color.WHITE)
				{
					//Intent i=new Intent(getApplicationContext(), w1.class);
					Intent i=new Intent(getApplicationContext(), cs1.class);
					
				startActivity(i);
				}
				else if(t12.getCurrentTextColor() == Color.WHITE)
				{
				//	Intent i=new Intent(getApplicationContext(), w2.class);
					Intent i=new Intent(getApplicationContext(), cs2.class);
					startActivity(i);
				}
				
				else if(t13.getCurrentTextColor() == Color.WHITE)
				{
					Intent i=new Intent(getApplicationContext(),w3.class);
					startActivity(i);
				}
				
				else if(t14.getCurrentTextColor() == Color.WHITE)
				{
					Intent i=new Intent(getApplicationContext(), w4.class);
					startActivity(i);
				}
				
			}
		});
    }
}
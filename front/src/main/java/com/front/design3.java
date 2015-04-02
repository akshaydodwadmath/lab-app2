package com.front;

import java.io.File;
import java.util.Calendar;

import com.front.Compress;
import com.front.Filehtml;
import com.front.HeaderHTM;
import com.front.Upload;
import com.front.design3;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class design3 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design3);
        
        
        final EditText e1=(EditText)findViewById(R.id.editText1);
        final EditText e2=(EditText)findViewById(R.id.editText2);
        final TextView t1=(TextView)findViewById(R.id.textView6);
        final TextView t2=(TextView)findViewById(R.id.textView8);
        final TextView t3=(TextView)findViewById(R.id.textView10);
        final TextView t4=(TextView)findViewById(R.id.textView15);
        final TextView t5=(TextView)findViewById(R.id.textView13);
        final Button b1=(Button)findViewById(R.id.button1);
        final Button b2=(Button)findViewById(R.id.button2);
        final Button b3=(Button)findViewById(R.id.button3);
        b1.setEnabled(false);
        b2.setEnabled(false);
        e2.setVisibility(View.INVISIBLE);
       
       
        
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
				c= a/0.0000005;
				t1.setText(c+"");
				d=b/a;
				t2.setText(d+"");
				e=d/0.0000005;
				t3.setText(e+"");
				f=e-c;
				t4.setText(f+"");
				g=((c+f)/(c*f));
				t5.setText(f+"");
				
			} catch (Exception e) {
				// TODO: handle exception
				Toast.makeText(getApplicationContext(), "enter the details", 500).show();
			}
			
			}
		
			
		});  
		TextWatcher tw21=new TextWatcher() {
			
			@Override
			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
				
				
				if (e1.length()>0 && e2.length()>0)
				{
					b2.setEnabled(true);
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
		e2.addTextChangedListener(tw21);
        b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub\
				
				Intent i=new Intent(getApplicationContext(), tabulation4.class);
				startActivity(i);
				
			}
		});
        
        
        b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				
	try{
    				
    				//tabulations
    			
    				  SharedPreferences set=getSharedPreferences("exp5", 0);
    	         
    				  
    					String conclus=set.getString("conc1", "");
    					SharedPreferences login_shared=getSharedPreferences("LOGIN", 0);
    					int rno=Integer.parseInt(login_shared.getString("rollno",""));
    					
    					
    					
    					String []subheads=new String[1];
    					subheads[0]="";
    					HeaderHTM heads[]=new HeaderHTM[4];
    					heads[0]=new HeaderHTM("Obs.<br/>No", subheads, 0, 0);
    				//	heads[1]=new HeaderHTM("f<br/>V(Hz)", subheads, 0, 0);
    					heads[1]=new HeaderHTM("V<sub>i</sub>", subheads, 0, 0);
    					heads[2]=new HeaderHTM("V<sub>o</sub>", subheads, 0, 0);
    					heads[3]=new HeaderHTM("Gain(A)", subheads, 0, 0);
    				//	heads[5]=new HeaderHTM("Gain(db)", subheads, 0, 0);
    					
    //
//    				String filetable[][]=new String[row][4];
//    				
//    				
//    				SharedPreferences edi=getSharedPreferences("exp5", 0);
//    	            
//    	            
//    	            for(int i=0;i<row;i++){
//    	            	filetable[i][0]=(i+1)+"";
//    	       //     filetable[i][1]=edi.getString("col1"+(i+1),	"");
//    	            filetable[i][1]=edi.getString("col1"+(i+1), "");
//    	            filetable[i][2]=edi.getString("col2"+(i+1), "");
//    	            filetable[i][3]=edi.getString("col3"+(i+1), "");
//    	       //    filetable[i][5]=edi.getString("col5"+(i+1), "");
//    	            
//    			}
    	            
    	            
    	        
    	            
    				
    				
    				
    				
    				//String h
    			
    				
    				
    				//calculations 
    				
//    				String filecalculation[]=new String[1];
    				
    				
    				try
    				{
    					File folder=new File("/sdcard/newexpt3/");
    					
    					if (!folder.exists()) 
    					{
    						folder.mkdir();

    					}

    					File folder1 = new File("/sdcard/newexpt3/design/");
    					if(!folder1.exists())
    						folder1.mkdir();
    					else
    					{
    						folder1.delete();
    						folder1.mkdir();	 
    					}
    				}
    				catch (Exception e) {
    					// TODO: handle exception
    				}
    			
    				
    				String file="/sdcard/newexpt3/design/"+rno+"_exptd3.html";
    				
    				Filehtml htm=new Filehtml(file);
    			
    				htm.writetitle("Instrumentation Amplifier");
    			
    				htm.write_expt_title("Instrumentation Amplifier");
    			
    				htm.writeroll_date(rno+"", java.text.DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime())+"");
    				
    				
    					
    				
    	//			htm.write_spctab(heads, filetable, "");
    				
    				
//    				htm.write_calc(filecalculation);
    				
    				htm.write_heading("Design");
    			//	htm.write_heading("LPF");
    				htm.write_ex("1.Assumed Vi :");
    				htm.write_ex2(e1.getText().toString());
    				htm.write_ex("2.Assumed Av :");
    				htm.write_ex2(e2.getText().toString());
    				htm.write_ex("3.Calculated R3 :");
    				htm.write_ex2(t1.getText().toString());
    				htm.write_ex("4.Calculated Vo :");
    				htm.write_ex2(t2.getText().toString());
    				htm.write_ex("5.Calculated R2 :");
    				htm.write_ex2(t4.getText().toString());
    			//	htm.write_heading("HPF");
    				htm.write_ex("6.Calculated R1 :");
    				htm.write_ex2(t5.getText().toString());
    			//	htm.write_ex("7.Calculated R6 :");
    			//	htm.write_ex2(t7.getText().toString());
    			//	htm.write_ex("8.Calculated R7 :");
    			//	htm.write_ex2(t8.getText().toString());
    			//	htm.write_ex("4.Calculated R :");
    		//		htm.write_ex2(t9.getText().toString());
    		//		htm.write_ex("5.Calculated Rf :");
    			//	htm.write_ex2(t10.getText().toString());
    				
    				
    				
    				
    		//		htm.write_concl(conclus);
    				
    				
      			String []ss=new String[1];
    				ss[0]=""+file;
    				//ss[1]="sdcard/EC_MS/Mosfet/mosfet.png";
    				
    				//String []ss=new String[1];
    				Compress c =new Compress(ss, "/sdcard/newexpt3/design/"+rno+"_exptd3.zip"); 
    				c.zip();
    				//<<<<<<<<<<<<<UPLOADING>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    				AlertDialog.Builder builder = new AlertDialog.Builder(design3.this);
    				builder.setMessage("Are you sure you want to submit?");
    				builder.setCancelable(false);
    				builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
    					public void onClick(DialogInterface dialog, int id) 
    					{


    						//<<<<<<<BROWSER>>>>>>>>>>


    						Intent up=new Intent();
    						up.setClass(getApplicationContext(),Upload.class);
    						startActivity(up);

    						//<<<<<<<<BROWSER>>>>>>>>>>



    						//<<<<<<<<<WEBVIEW>>>>>>>>>>>>

    						

    						//<<<<<<<<<<WEBVIEW>>>>>>>>>>>>>>>






    					}
    				})
    				.setNegativeButton("No", new DialogInterface.OnClickListener() {
    					public void onClick(DialogInterface dialog, int id) {
    						dialog.cancel();
    					}
    				});
    				AlertDialog alert = builder.create();
    				alert.show();
    				
    				}
    				catch (NumberFormatException e) {
    					// TODO: handle exception
    					Toast.makeText(getApplicationContext(), "Error submitting file"+e.getMessage(), 1000).show();
    				}
    			
    		}
    	});
    	
    
        
    }
}


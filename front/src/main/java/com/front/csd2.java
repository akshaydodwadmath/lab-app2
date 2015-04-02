package com.front;

import java.io.File;


import java.util.Calendar;

import com.front.Compress;
import com.front.Filehtml;
import com.front.HeaderHTM;
import com.front.Upload;
import com.front.csd2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class csd2 extends Activity {
    /** Called when the activity is first created. */
   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.csd2);

	
	Button b1 =(Button)findViewById(R.id.button1);
	Button b2 =(Button)findViewById(R.id.button2);

	final EditText t1=(EditText)findViewById(R.id.editText1);
	final EditText t2=(EditText)findViewById(R.id.editText2);

	
	final TextView u1=(TextView)findViewById(R.id.textView4);
	final TextView u2=(TextView)findViewById(R.id.textView7);
	final TextView u3=(TextView)findViewById(R.id.textView2);
	final TextView u4=(TextView)findViewById(R.id.textView5);
	


	b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
		try {
			
			
			double a,b,c,d,e,f,g,h;
			
			a=Double.parseDouble(t1.getText().toString());
			e=Double.parseDouble(t2.getText().toString());
			if(a>=0&&e>=0)
			{
			 b=Math.toRadians(a);
			 c=Math.sin(b);
			 
			 d=((1-c)/(1+c));
				u1.setText(d+"");
			 
			 f=1/(2*3.142*e*Math.sqrt(d));
			 u2.setText(f+"");
			 g=f/(0.0000001);
			 u3.setText(g+"");
			 h=d*g/(1-d);
			 u4.setText(h+"");
			 
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			
			Toast.makeText(getApplicationContext(), "enter the details", 500).show();
		}
			
			
			
		}
	});
	
	b2.setOnClickListener(new OnClickListener() {
		
		
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
					//heads[3]=new HeaderHTM("Gain(A)", subheads, 0, 0);
				//	heads[5]=new HeaderHTM("Gain(db)", subheads, 0, 0);
					
//
//				String filetable[][]=new String[row][4];
//				
//				
//				SharedPreferences edi=getSharedPreferences("exp5", 0);
//	            
//	            
//	            for(int i=0;i<row;i++){
//	            	filetable[i][0]=(i+1)+"";
//	       //     filetable[i][1]=edi.getString("col1"+(i+1),	"");
//	            filetable[i][1]=edi.getString("col1"+(i+1), "");
//	            filetable[i][2]=edi.getString("col2"+(i+1), "");
//	            filetable[i][3]=edi.getString("col3"+(i+1), "");
//	       //    filetable[i][5]=edi.getString("col5"+(i+1), "");
//	            
//			}
	            
	            
	        
	            
				
				
				
				
				//String h
			
				
				
				//calculations 
				
//				String filecalculation[]=new String[1];
				
				
				try
				{
					File folder=new File("/sdcard/cs2/");
					
					if (!folder.exists()) 
					{
						folder.mkdir();

					}

					File folder1 = new File("/sdcard/cs2/design/");
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
			
				
				String file="/sdcard/cs2/design/"+rno+"_expt1.html";
				
				Filehtml htm=new Filehtml(file);
			
				htm.writetitle("Frequency Response Of A Lead Network");
			
				htm.write_expt_title("Frequency Response Of A Lead Network");
			
				htm.writeroll_date(rno+"", java.text.DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime())+"");
				
				
					
				
	//			htm.write_spctab(heads, filetable, "");
				
				
//				htm.write_calc(filecalculation);
				
				htm.write_heading("Design");
				htm.write_ex("1.Entered phase value : ");
				htm.write_ex2(t1.getText().toString());
				htm.write_ex("2.Entered frequency value : ");
				htm.write_ex2(t2.getText().toString());
				htm.write_ex("3.Value of alpha :");
				htm.write_ex2(u1.getText().toString());
				htm.write_ex("4.Value of time constant :");
				htm.write_ex2(u2.getText().toString());
				htm.write_ex("5.Calculated R1 :");
				htm.write_ex2(u3.getText().toString());
				htm.write_ex("5.Calculated R2 :");
				htm.write_ex2(u4.getText().toString());
				
				
				
				
				htm.write_concl(conclus);
				
				
  			String []ss=new String[1];
				ss[0]=""+file;
				//ss[1]="sdcard/EC_MS/Mosfet/mosfet.png";
				
				//String []ss=new String[1];
				Compress c =new Compress(ss, "/sdcard/cs2/design/"+rno+"_expt1.zip"); 
				c.zip();
				//<<<<<<<<<<<<<UPLOADING>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

				AlertDialog.Builder builder = new AlertDialog.Builder(csd2.this);
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

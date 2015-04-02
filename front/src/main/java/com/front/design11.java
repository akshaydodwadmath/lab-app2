package com.front;

import java.io.File;
import java.util.Calendar;

import com.front.Compress;
import com.front.Filehtml;
import com.front.HeaderHTM;
import com.front.Upload;
import com.front.design11;

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

public class design11 extends Activity {
    /** Called when the activity is first created. */
   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design11);

	
	Button b1 =(Button)findViewById(R.id.button1);
	Button b2 =(Button)findViewById(R.id.button2);

	final EditText t1=(EditText)findViewById(R.id.editText1);
	final EditText t2=(EditText)findViewById(R.id.editText2);
	
	final TextView u1=(TextView)findViewById(R.id.textView2);
	final TextView u2=(TextView)findViewById(R.id.textView5);
	final TextView u3=(TextView)findViewById(R.id.textView6);
	


	b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
		try {
			
			
			double a,b,c,d,e;
			a=Double.parseDouble(t1.getText().toString());
			b=Double.parseDouble(t2.getText().toString());
			
			if(a>=0&&b>=0)
			{
				c=(a-(b/2))/0.00005;
				u1.setText(c+"");
				
				d=(b/2)/0.00005;
				u2.setText(d+"");
				
				e=(a-(b/2))/0.02;
				u3.setText(e+"");
				
			
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
					File folder=new File("/sdcard/expt1/");
					
					if (!folder.exists()) 
					{
						folder.mkdir();

					}

					File folder1 = new File("/sdcard/expt1/new2/");
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
			
				
				String file="/sdcard/expt1/new2/"+rno+"_expt1.html";
				
				Filehtml htm=new Filehtml(file);
			
				htm.writetitle("Op Amp Voltage regulator");
			
				htm.write_expt_title("Op Amp Voltage regulator");
			
				htm.writeroll_date(rno+"", java.text.DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime())+"");
				
				
					
				
	//			htm.write_spctab(heads, filetable, "");
				
				
//				htm.write_calc(filecalculation);
				
				htm.write_heading("Design");
				htm.write_ex("1.Enter desired o/p voltage(Vo)");
				htm.write_ex2(t1.getText().toString());
				htm.write_ex("2.Enter the supply voltage(Vz)");
				htm.write_ex2(t2.getText().toString());
				htm.write_ex("3.Calculated R1 :");
				htm.write_ex("4.Calculated R2:");
				htm.write_ex("5.Calculated R3 :");
				
				
				
				
				htm.write_concl(conclus);
				
				
  			String []ss=new String[1];
				ss[0]=""+file;
				//ss[1]="sdcard/EC_MS/Mosfet/mosfet.png";
				
				//String []ss=new String[1];
				Compress c =new Compress(ss, "/sdcard/expt1/new2/"+rno+"_expt1.zip"); 
				c.zip();
				//<<<<<<<<<<<<<UPLOADING>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

				AlertDialog.Builder builder = new AlertDialog.Builder(design11.this);
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

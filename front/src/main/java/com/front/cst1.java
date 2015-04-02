package com.front;





        import java.io.File;
import java.util.Calendar;



import android.app.Activity;
        import android.app.AlertDialog;
        import android.app.Dialog;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.os.Bundle;
        import android.text.Editable;
        import android.text.InputType;
        import android.text.TextWatcher;
        import android.view.Gravity;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.CompoundButton;
        import android.widget.CompoundButton.OnCheckedChangeListener;
        import android.widget.EditText;
        import android.widget.TableLayout;
        import android.widget.TableRow;
        import android.widget.TextView;
        import android.widget.Toast;
import android.widget.TableLayout.LayoutParams;

        public class cst1 extends Activity {
        	
        	int row=0;
        	int rowp=0;
        	int rowt=0;
        	
        	EditText[][] evalues= new EditText[50][50];
        	TextView[][] tvalues= new TextView[50][50];
        	
                Button[][] cvalues=new Button[50][50];
        	
        	Bundle bundle1 = new Bundle();
        	
        	
        	public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.cst1);
                
                final EditText rows=(EditText)findViewById(R.id.row);
                final Button b1=(Button)findViewById(R.id.b1);
                
        b1.setEnabled(false);
                
                TextWatcher end=new TextWatcher() {
        			
        			public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
        				// TODO Auto-generated method stub
        				
        					if(rows.length()>0)
        				  b1.setEnabled(true);
        				else
        					b1.setEnabled(false);
        				
        			}
        			
        			public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
        					int arg3) {
        				// TODO Auto-generated method stub
        			}
        			
        			public void afterTextChanged(Editable arg0) {
        				// TODO Auto-generated method stub
        				
        			}
        		};
        		
        		rows.addTextChangedListener(end);
        		
        	
        		
        		final TextView textV=(TextView)findViewById(R.id.textV);
        		final TableRow tableRow1=(TableRow)findViewById(R.id.tableRow1);
        		final TableRow tableRow2=(TableRow)findViewById(R.id.tableRow2);
				final TableLayout t1=(TableLayout)findViewById(R.id.table);
        		textV.setVisibility(View.INVISIBLE);
        		tableRow1.setVisibility(View.INVISIBLE);
        		tableRow2.setVisibility(View.INVISIBLE);
        		
        		
        		
        		
        		b1.setOnClickListener(new OnClickListener() {
        			
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        				
        				t1.removeAllViews();
        				 rowt=Integer.parseInt(rows.getText().toString());
//                         rowp=row;
        				 row=row+rowt;		
        				 rowp=rowt;
                          
        								textV.setVisibility(View.VISIBLE);
        								tableRow1.setVisibility(View.VISIBLE);
        								tableRow2.setVisibility(View.VISIBLE);
        				
        				

        				TableLayout.LayoutParams params=new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT);
        				
        				TableRow tr[]=new TableRow[rowp];
        				
        				b1.setEnabled(false);
        				//rows.setEnabled(false);
        				
        				for(int i=0;i<rowp;i++)
        				{
        					tr[i]=new TableRow(getApplicationContext());
        					tr[i].setLayoutParams(new TableRow.LayoutParams(
        							LayoutParams.FILL_PARENT,
        							LayoutParams.WRAP_CONTENT));
        					//tr[i].setId(i);
        					t1.addView(tr[i], new TableLayout.LayoutParams(
        			                 LayoutParams.FILL_PARENT,
        			                 LayoutParams.WRAP_CONTENT));
        					
        					for(int j=0;j<1;j++)
        					{
        						tvalues[i][j]=new TextView(getApplicationContext());
        						tvalues[i][j].setWidth(100);
        						tvalues[i][j].setText((i+1)+"");
        						tvalues[i][j].setGravity(1);
        						tr[i].addView(tvalues[i][j], new TableRow.LayoutParams(android.view.ViewGroup.LayoutParams.WRAP_CONTENT, android.view.ViewGroup.LayoutParams.WRAP_CONTENT));
        						
        					}
        					
        					
        					for(int k=0;k<2;k++)
        					{
        						evalues[i][k]=new EditText(getApplicationContext());
        						evalues[i][k].setWidth(100);
        						evalues[i][k].setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);
        						evalues[i][k].setGravity(1);
        						tr[i].addView(evalues[i][k], new TableRow.LayoutParams(android.view.ViewGroup.LayoutParams.WRAP_CONTENT, android.view.ViewGroup.LayoutParams.WRAP_CONTENT));
        						
        					}
        					
        					for(int j=1;j<2;j++)
        					{
        						tvalues[i][j]=new TextView(getApplicationContext());
        						tvalues[i][j].setWidth(100);
        						tvalues[i][j].setText("---");
        						tvalues[i][j].setGravity(1);
        						tr[i].addView(tvalues[i][j], new TableRow.LayoutParams(android.view.ViewGroup.LayoutParams.WRAP_CONTENT, android.view.ViewGroup.LayoutParams.WRAP_CONTENT));
        						
        					}
        					
        					
        					for(int j=0;j<1;j++)
        					{
        						cvalues[i][j]=new Button(getApplicationContext());
//        						cvalues[i][j].setWidth(100);
//        						cvalues[i][j].setText("---");
        						//cvalues[i][j].setGravity(1);
        						cvalues[i][j].setId(i);
        						tr[i].addView(cvalues[i][j], new TableRow.LayoutParams(android.view.ViewGroup.LayoutParams.WRAP_CONTENT, android.view.ViewGroup.LayoutParams.WRAP_CONTENT));
        						
        						
        					}
        					
        					
        					
        				}
        				
        				
        				
//        				TableRow tr1=(TableRow)findViewById(R.id.TableRow01);
//        				tr1.setVisibility(View.INVISIBLE);
        				
        			}
        		});
        		
        		

        		
          		
        		Button clear=(Button)findViewById(R.id.clear);
        		final Button graph=(Button)findViewById(R.id.graph);
        		Button calci=(Button)findViewById(R.id.calci);
        		final Button conclusion=(Button)findViewById(R.id.conc);
        		final Button submit=(Button)findViewById(R.id.submit);
        		
        		//graph.setEnabled(false);
        		conclusion.setEnabled(false);
        		submit.setEnabled(false);
        		
        		//graph.setVisibility(View.INVISIBLE);
        		conclusion.setVisibility(View.INVISIBLE);
        		submit.setVisibility(View.INVISIBLE);
        		
        		clear.setOnClickListener(new OnClickListener() {
        			
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        				
        				Intent myintent = new Intent();
        				myintent.setClass(getApplicationContext(), cst1.class);
        				 
        				startActivityForResult(myintent, 0);
        				setResult(RESULT_OK, myintent);
        				finish();
        				
        			}
        		});
        		
        		 
        		
        		calci.setOnClickListener(new OnClickListener() {
        			
        			 
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        				submit.setVisibility(View.VISIBLE);
        				conclusion.setVisibility(View.VISIBLE);
       	        	 conclusion.setEnabled(true);
        		//		double freq[]=new double[row];
        				  double vi[]=new double[row];
        				 double vo[]=new double[row];
        				  double gain[]=new double[row];
        			//	  double gdb[]=new double[row];
        				
        				try
        				{
        					double check;
        					
        					for(int i=0;i<row;i++)
        					{
        						check=Double.parseDouble(evalues[i][0].getText().toString());
        						check=Double.parseDouble(evalues[i][1].getText().toString());
        					//	check=Double.parseDouble(evalues[i][2].getText().toString());
        						
        					}
        					
        					
        		        	 
        		      //  	 graph.setVisibility(View.VISIBLE);
        		        	 
        				}
        				catch (Exception e) {   //do something if an IOException occurs. }
        					
        					Toast.makeText(getApplicationContext(), "Enter all the Values",500).show();
        			  	   }
        				
        				try
        				{
        					for(int i=0;i<row;i++)
        					{
        				//		freq[i]=Double.parseDouble(evalues[i][0].getText().toString());
        						
        						
        						
        						vi[i]=Double.parseDouble(evalues[i][0].getText().toString());
        						
        						
        						
        						vo[i]=Double.parseDouble(evalues[i][1].getText().toString());
        												
        					}
        					
        					
        					
        					for(int i=0;i<row;i++)
        			        {        	      			        			
        			        	   gain[i]=vo[i]/vi[i];
        			        	 //  gdb[i]=(20)*Math.log10(gain[i]);
        			        	   	
        			        }
        					
        					
        					for(int v=0;v<row;v++)
        					{
        						tvalues[v][1].setText(""+String.format("%.2f",gain[v]));
        						
        				//		tvalues[v][2].setText(""+String.format("%.2f",gdb[v]));
        						
        						 conclusion.setEnabled(true);
        						 
        					//	 graph.setEnabled(true);
        					}
        				}
        				catch(Exception Ex)
        			      {
        			    	  Toast.makeText(getApplicationContext(), "Enter the valid data",1000).show();
        			      }
        				
        				
        				
        				
        				try
        				{
        					String[] res1=new String[row];
        		      //  	String[] res2=new String[row];
        		        	
        		        	
        		        	SharedPreferences sp=getSharedPreferences("exp5", 0);
        		            SharedPreferences.Editor edi=sp.edit();
        		            
                        edi.putString("rows", row+"");
        		            
        		        	
        		        	for(int i=0;i<row;i++){
        		  		

        		        		res1[i]=String.format("%.2f", gain[i]);
        		        	//	res2[i]=String.format("%.2f", gdb[i]);
        		        		
        		        	//	edi.putString("col1"+(i+1),	freq[i]+"");
        			            edi.putString("col2"+(i+1), vi[i]+"");
        			            edi.putString("col3"+(i+1), vo[i]+"");
        			            edi.putString("col4"+(i+1), res1[i]+"");
        			          //  edi.putString("col5"+(i+1), res2[i]+"");
        		        	}
        		        	
        		       // 	bundle1.putDoubleArray("freq",freq );
            	       //     bundle1.putDoubleArray("gdb",gdb);
        		        	
        		        	 edi.commit();
        		        	 
        		        	 
        					  	
        				}
        				catch (Exception e) {
        					// TODO: handle exception
        				}
        				
        			}
        		});
        		
        		
        	//	graph.setOnClickListener(new OnClickListener() {
        			
        		//	public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        				
        			
        	        	 
        	        //	 graph.setEnabled(false);
        	//		}
        	//	});
        		
        		
        		conclusion.setOnClickListener(new OnClickListener() {
        			
        			public void onClick(View arg0) {
        				// TODO Auto-generated method stub
        				
        				final Dialog dialog = new Dialog(cst1.this);
                        dialog.setContentView(R.layout.conclusion);
                        dialog.setTitle("Enter the Conclusion of the experiment below");
                        dialog.setCancelable(true);
                        //there are a lot of settings, for dialog, check them all out!

                        //set up text
                        final EditText text = (EditText) dialog.findViewById(R.id.editText1);
                        text.setGravity(Gravity.TOP);
                       
                        
                        text.setWidth(500);
                        text.setHeight(391);
                        //set up image view
                    //    ImageView img = (ImageView) dialog.findViewById(R.id.ImageView01);
                      //  img.setImageResource(R.drawable.nista_logo);
                         
                        //set up button
                        Button button = (Button) dialog.findViewById(R.id.Button01);
                        button.setOnClickListener(new OnClickListener() {
                        public void onClick(View v) {
                        	String test=text.getText().toString();
                        	
                        	
                        	
                            if(test.length()!=0){
                         	String conc=text.getText().toString();
                             conc+="\n\n";
                           
                             
                             
                             SharedPreferences set=getSharedPreferences("exp5", 0);
                             final SharedPreferences.Editor edit=set.edit();
                          
                             edit.putString("conc1",conc+"");
                             
                             edit.commit();
                             
                             submit.setVisibility(View.VISIBLE);
                             submit.setEnabled(true);
                             
                             
                             
                             Toast.makeText(getApplicationContext(), "Conclusion Written", Toast.LENGTH_LONG).show();
                         	dialog.cancel();
                         	submit.setEnabled(true);
                         	//conclusion.setEnabled(false);
                             //finish();
                             }
                            else{
                         	   Toast.makeText(getApplicationContext(), "Conclusion field should'nt be Empty", Toast.LENGTH_LONG).show();
                            }
                         
                         }
                        
                         });
                         //now that the dialog is set up, it's time to show it    
                         dialog.show();
        				
        			}
        		});
        		
        		
        		submit.setOnClickListener(new OnClickListener() {
            		
            		
            		public void onClick(View v) {
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
            					

            				String filetable[][]=new String[row][4];
            				
            				
            				SharedPreferences edi=getSharedPreferences("exp5", 0);
            	            
            	            
            	            for(int i=0;i<row;i++){
            	            	filetable[i][0]=(i+1)+"";
            	       //     filetable[i][1]=edi.getString("col1"+(i+1),	"");
            	            filetable[i][1]=edi.getString("col2"+(i+1), "");
            	            filetable[i][2]=edi.getString("col3"+(i+1), "");
            	            filetable[i][3]=edi.getString("col4"+(i+1), "");
            	       //    filetable[i][5]=edi.getString("col5"+(i+1), "");
            	            
            	            }
            	            
            	            
            	        
            	            
            				
            				
            				
            				
            				//String h
            			
            				
            				
            				//calculations 
            				
//            				String filecalculation[]=new String[1];
            				
            				
            				try
            				{
            					File folder=new File("/sdcard/cs1/");
            					
            					if (!folder.exists()) 
            					{
            						folder.mkdir();

            					}

            					File folder1 = new File("/sdcard/cs1/tab/");
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
            			
            				
            				String file="/sdcard/cs1/tab/"+rno+"_expt2.html";
            				
            				Filehtml htm=new Filehtml(file);
            			
            				htm.writetitle("Frequency & Transient Response of 2nd Order System");
            			
            				htm.write_expt_title("Frequency & Transient Response of 2nd Order System");
            			
            				htm.writeroll_date(rno+"", java.text.DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime())+"");
            				
            				
            					
            				
            				htm.write_spctab(heads, filetable, "");
            				
            				
//            				htm.write_calc(filecalculation);
            				
            				htm.write_concl(conclus);
            				
              			String []ss=new String[1];
            				ss[0]=""+file;
            				//ss[1]="sdcard/EC_MS/Mosfet/mosfet.png";
            				
            				//String []ss=new String[1];
            				Compress c =new Compress(ss, "/sdcard/cs1/tab/"+rno+"_expt2.zip"); 
            				c.zip();
            				//<<<<<<<<<<<<<UPLOADING>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

            				AlertDialog.Builder builder = new AlertDialog.Builder(cst1.this);
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
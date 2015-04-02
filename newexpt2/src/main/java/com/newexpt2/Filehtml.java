package com.newexpt2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Filehtml {

	String init="<html>\n" +
				"<head>\n" +
				"<title>\n";
	String filename=new String();
	public Filehtml(String filename)
	{
		try
		{
			File f=new File(filename);
			this.filename=filename;
			FileWriter of=new FileWriter(f);
			of.write(init);
			of.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			
		}
	}
	public int writetitle(String title)
	{
		try {
			
			FileWriter of=new FileWriter(filename, true);
			of.append(title);
			of.append("</title>\n");
			of.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		return 0;
	}
	public int write_expt_title(String title)
	{
		try {
			FileWriter of=new FileWriter(filename, true);
			of.append("<body>\n");
			of.append("<h1><center><u>"+title+"</h1></u></center><br/>\n");
			of.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		return 0;
	}
	
	public int write_heading(String ex)
	{
		try{
			FileWriter of=new FileWriter(filename,true);
			of.append("<h1><u>"+ex+"</u></h1><br/>\n");
			of.close();
					
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return -1;
			}
		return 0;
		
	}
	public int write_ex(String ex)
	{
		try{
			FileWriter of=new FileWriter(filename,true);
			of.append(""+ex+"");
			of.close();
					
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return -1;
			}
		return 0;
		
	}
	
	
	public int write_ex2(String ex)
	{
		try{
			FileWriter of=new FileWriter(filename,true);
			of.append("<u>"+ex+"</u><br/>\n");
			of.close();
					
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return -1;
			}
		return 0;
		
	}
	
	public int writeroll_date(String roll,String Date)
	{
		try {
			FileWriter of=new FileWriter(filename, true);
			//of.append("<body>\n");
			of.append("<h2>Roll No: "+roll+"\n<br/>Date & Time of Submission: "+Date+"</h2><br/><hr>\n");
			of.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		return 0;
	}
	
	public int write_rob(String[] rob)
	{
		try {
			FileWriter of=new FileWriter(filename, true);
			//of.append("<body>\n");
			of.append("<h3><u>Record of observations:</h3></u><br/>\n");
			for(int i=0;i<rob.length;i++)
			{
				of.append(rob[i]+"\n<br/>");
			}
			of.append("<hr>");
			of.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		return 0;
	}
	
	public int write_tab(String[] HeaderHTM,String[][]val,String tabhead)
	{
		try {
			FileWriter of=new FileWriter(filename, true);
			//of.append("<body>\n");
			of.append("<h3><u>Tabulations<br/></h3></h2>\n"+tabhead+"</h2></u><br/>\n");
			of.append("<table border=6>\n");
			for(int i=0;i<HeaderHTM.length;i++)
			{
				of.append("<th><center>"+HeaderHTM[i]+"</center></th>\n");
			}
			
			for(int i=0;i<val.length;i++)
			{
				of.append("<tr>\n");
				for(int j=0;j<val[i].length;j++)
				{
					of.append("<td><center>"+val[i][j]+"</center></td>\n");
				}
				of.append("</tr>\n");
			}
			of.append("</table><hr>");
			of.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		return 0;
	}
	
	
	
	public int write_blanktab(String[] HeaderHTM,String string,String tabhead)
	{
		try {
			FileWriter of=new FileWriter(filename, true);
			//of.append("<body>\n");
			//of.append("<h3><u>Tabulations<br/></h3></h2>\n"+tabhead+"</h2></u><br/>\n");
			of.append("<table border=0>\n");
			for(int i=0;i<HeaderHTM.length;i++)
			{
				of.append("<th><center>"+HeaderHTM[i]+"</center></th>\n");
			}
			
			
			{
				of.append("<tr>\n");
				//for(int j=0;j<string.length();j++)
				{
					of.append("<td><center>"+string+"</center></td>\n");
				}
				of.append("</tr>\n");
			}
			of.append("</table><hr>");
			of.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		return 0;
	}
	
	
	public int write_spctab(HeaderHTM[] heads,String[][]val,String tabhead)
	{
		try {
			FileWriter of=new FileWriter(filename, true);
			//of.append("<body>\n");
			
			
			of.append("<h3><u>Tabulations<br/></h3></h2>\n"+tabhead+"</h2></u><br/>\n");
			of.append("<table border=6>\n");
			int rowsp[]=new int[100];
			HeaderHTM.MaxRowCount(heads,rowsp);
			of.append("<tr>\n");
			int colco=0;
			for(int i=0;i<heads.length;i++)
			{
				if(heads[i].nor!=rowsp[0])
				{
					of.append("<th rowspan="+(rowsp[0]+1)+"><center>"+heads[i].head+"</center></th>\n");
				}
				else
				{
					of.append("<th colspan="+heads[i].noc+"><center>"+heads[i].head+"</center></th>\n");
					colco=heads[i].noc;
					//System.out.print("\n\n\n\nColco"+colco+"\n\n\n");
				}
			}
			of.append("</tr>\n");
			of.append("<tr>\n");
			for(int i=0;i<colco;i++)
			{
				of.append("<th><center>"+heads[rowsp[1]].subheads[i]+"</center></th>\n");
			}
			of.append("</tr>\n");
			
	
			
			
			
			for(int i=0;i<val.length;i++)
			{
				of.append("<tr>\n");
				for(int j=0;j<val[i].length;j++)
				{
					of.append("<td><center>"+val[i][j]+"</center></td>\n");
				}
				of.append("</tr>\n");
			}
			of.append("</table><hr>");
			of.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		return 0;
	}
	
	
	public int write_spcrobtab(HeaderHTM[] heads,String[][]val,String tabhead)
	{
		try {
			FileWriter of=new FileWriter(filename, true);
			//of.append("<body>\n");
			
			
			of.append("<h3><u>Record Of Observations:\n<br/></h3></h2>\n"+tabhead+"</h2></u><br/>\n");
			of.append("<table border=6>\n");
			int rowsp[]=new int[100];
			HeaderHTM.MaxRowCount(heads,rowsp);
			of.append("<tr>\n");
			int colco=0;
			for(int i=0;i<heads.length;i++)
			{
				if(heads[i].nor!=rowsp[0])
				{
					of.append("<th rowspan="+(rowsp[0]+1)+"><center>"+heads[i].head+"</center></th>\n");
				}
				else
				{
					of.append("<th colspan="+heads[i].noc+"><center>"+heads[i].head+"</center></th>\n");
					colco=heads[i].noc;
					//System.out.print("\n\n\n\nColco"+colco+"\n\n\n");
				}
			}
			of.append("</tr>\n");
			of.append("<tr>\n");
			for(int i=0;i<colco;i++)
			{
				of.append("<th><center>"+heads[rowsp[1]].subheads[i]+"</center></th>\n");
			}
			of.append("</tr>\n");
			
	
			
			
			
			for(int i=0;i<val.length;i++)
			{
				of.append("<tr>\n");
				for(int j=0;j<val[i].length;j++)
				{
					of.append("<td><center>"+val[i][j]+"</center></td>\n");
				}
				of.append("</tr>\n");
			}
			of.append("</table><hr>");
			of.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		return 0;
	}
	public int write_calc(String[] calc)
	{
		try {
			FileWriter of=new FileWriter(filename, true);
			//of.append("<body>\n");
			of.append("<h3><u>Calculations:</h3></u><br/>\n");
			for(int i=0;i<calc.length;i++)
			{
				of.append(calc[i]+"\n<br/>");
			}
			of.append("<hr>");
			of.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		return 0;
	}
	
	public void write_gen(String any)
	{
		try
		{
			FileWriter of=new FileWriter(filename, true);
			of.append(any);
			of.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int write_concl(String concl)
	{
		try {
			FileWriter of=new FileWriter(filename, true);
			//of.append("<body>\n");
			of.append("<h3><u>Conclusion:</h3></u><br/>\n");
			
			
				of.append(concl+"\n<br/>");
			
			of.append("<hr>");
			of.append("<center>END</center>\n");
			of.append("</body>\n");
			of.append("</head>\n");
			of.append("</html>\n");
			of.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		return 0;
	}
	
}



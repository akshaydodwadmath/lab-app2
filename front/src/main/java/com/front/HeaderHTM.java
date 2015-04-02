package com.front;

public class HeaderHTM
{
	String head;
	String[] subheads;
	int nor,noc;
	HeaderHTM()
	{
		
	}
	public HeaderHTM(String head,String[] subheads,int nor,int noc)
	{
		this.head=head;
		this.subheads=new String[subheads.length];
		for(int i=0;i<subheads.length;i++)
		{
			this.subheads[i]=subheads[i];
		}
		this.nor=nor;
		this.noc=noc;
		
	}
	
	static int MaxRowCount(HeaderHTM[] heads,int []rowsp)
	{
		int max=heads[0].nor,j=0,k=1;
		for(int i=0;i<heads.length;i++)
		{
			if(max<heads[i].nor)
			{
				max=heads[i].nor;
				j=i;
				rowsp[k]=j;
				System.out.print("\n\n\n\nRowsp"+rowsp[k]+"\n\n\n\n\n");
				k++;
			}
			else if(max==heads[i].nor)
			{
				max=heads[i].nor;
				j=i;
				
			}
		}
		rowsp[0]=max;
	
		return max;
	}
	
}

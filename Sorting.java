package arrays;

import javax.net.ssl.SSLEngine;

public class Sorting 
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,20,30,50};
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=x+1;y<=a.length-1;y++)
			{
				int temp=a[x];
				if(a[x]>a[y])
					{
						a[x]=a[y];
						a[y]=temp;
					}
			}
		}
		for(int variable:a)
		{
			System.out.println(variable);
		}
	}

}

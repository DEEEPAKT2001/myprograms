package arrays;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of element");
		int size=s.nextInt();
		int b[]=new int[size];
		for(int x=0; x<=b.length-1; x++)
		{
			b[x]=s.nextInt();
		}
		int count=0;
		for(int x=0; x<=b.length-1; x++)
		{
			count=0;
			for(int y=1; y<=b[x]; y++)
			{
				if(b[x]%y==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(b[x]+" is prime");
			}
		}
		
	}
}

package arrays;

import java.util.Scanner;

public class Sumbyscanner {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("size of arrays");
		int sizes=s.nextInt();
		int a[]=new int[sizes];
		System.out.println("enter  "+sizes+"  arrays element");
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=s.nextInt();
		}
		int sum=0;
		for(int x=0;x<=a.length-1;x++)
		{
			sum=sum+a[x];
			
			System.out.println("a["+x+"]="+a[x]);
		}
		System.out.println("sum of input is  "+sum);
	}

}

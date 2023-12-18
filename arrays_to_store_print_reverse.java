package arrays;

import java.util.Scanner;

public class arrays_to_store_print_reverse {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("size of an arrays");
		int size=s.nextInt();
		int a[]=new int[size];
	
		System.out.println("enter "+size+"array elements");
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=s.nextInt();
		}
		int b[]=new int[a.length];
		for(int x=0;x<=a.length-1;x++)
		{
			b[x]=a[x];
		}
		for(int x=0;x<=b.length-1;x++)
		{
			System.out.println("b["+x+"]="+b[x]);
		}
		int y=a.length-1;
		for(int x=0; x<=b.length-1; x++ )
		{
			b[x]=a[y];
			y--;
			System.out.println(b[x]);
		}
	}

}

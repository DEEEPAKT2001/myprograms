package arrays;

public class For_each {

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,8,9};
		int count=0;
		for(int temp:a)
		{
			count++;
		}
		System.out.println(count+"  length of array");
		System.out.println("                               ");
		for(int x=0;x<=a.length-1;x++)
		{
			if(x%2==0)
				System.out.println(a[x]+" even of length array");
		}
	}

}

package arrays;

public class Arrays_sum {

	public static void main(String[] args) 
	{
	int a[]=new int[] {10,15,51,95};
	int sum=0,x=10;
	System.out.println("arrays elements are"+a.length);
	for(x=0;x<=a.length-1;x++)
	{
		sum=sum+a[x];
		System.out.println(a[x]);
	}
	System.out.println("sum of given arrays is  "+sum );
	}

}

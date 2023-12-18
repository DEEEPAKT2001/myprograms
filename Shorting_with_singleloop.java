package arrays;

public class Shorting_with_singleloop 
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,20,30,50,60,15};
		for(int x=0,y=x;x<=a.length-1;x++,y++)
		{
			
			int temp=a[x];
			if(a[x]<a[y])
				{
					a[x]=a[y];
					a[y]=temp;
				}	
			
		}
		for(int variable:a)
		{
			System.out.println(variable);	
		}
	}

}

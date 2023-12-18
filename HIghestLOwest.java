package arrays;

public class HIghestLOwest 
{

	public static void main(String[] args) 
	{
		int a[]=new int[] {10,2,5,30,40,25,35,35};
		for(int x=0;x<=a.length-1;x++)
		{
			for(int y=x+1;y<=a.length-1;y++)
			{
				if(a[x]>a[y])
				{
					int temp=a[x];
					a[x]=a[y];
					a[y]=temp;
				}
			}
		}
		//
		int abc=0,A=1;
		for(int z=0;z<a.length-1;z++)
		{
			if(a[0]<a[A])
			{
				abc=a[1];
				break;
			}
			else
				A++;
		}
		System.out.println("second smallest " +abc);
	}

}

package arrays;

public class Linear_search 
{

	public static void main(String[] args) 
	{
		int a[]=new int [] {10,51,36,80,60};
		int search=60,temp=0;
		{
			for (int x=0;x<a.length;x++)
			{
				if (a[x]==search)
				{
					temp++;
					System.out.println("element found on :"+x);
					break;
				}
			}
			if (temp==0)
				System.out.println("not found");
		}
	}

}

package TYSS_Arrays;

public class AdditionOfTwoArrays {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,8,7,9,6,5};
		int b[]= {4,5,6,7,8};
		int leng=a.length;
		
		if(a.length<b.length)
		{
			leng=b.length;
		}
		for(int i=0;i<leng;i++)
		{
			try
			{
				System.out.println(a[i]+b[i]+" ");
			}
			catch(Exception e)
			{
				if(a.length<b.length)
				{
					System.out.println(b[i]);
				}
				else
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}

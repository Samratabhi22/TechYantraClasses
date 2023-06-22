package TyssSeleniumClass;

public class B {

	public static void main(String[] args) {
		int a[] = {1,2,4,5,2};
		int b[] = {1,2,4};
		int leng=a.length;
		if(a.length<b.length)
		{
			leng=b.length;
			
		}
		for(int i=0;i<a.length;i++)
		{
		try
		{
			System.out.println(a[i]+b[i]+" ");
		}
		catch(Throwable e)
		{
			if(a.length<b.length)
			{
				System.out.println(b[i]+" ");
			}
			else
			{
				System.out.println(a[i]+" ");
			}
		}
		}
	}
}


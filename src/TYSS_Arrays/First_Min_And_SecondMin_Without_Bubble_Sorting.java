package TYSS_Arrays;

public class First_Min_And_SecondMin_Without_Bubble_Sorting {

	public static void main(String[] args) {
		int a[] = {0,10,9,1,8,7,8,5,2,0,1,1};
		int fmin=a[0];
		int smin=a[1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fmin)
			{
				fmin=a[i];
			}
//		}
//		for(int i=0;i<a.length;i++)
//		{
			if(a[i]<smin && a[i]!=fmin)
			{
				smin=a[i];
			}
		}	
		
		System.out.println(fmin);
		System.out.println(smin);

	}

}

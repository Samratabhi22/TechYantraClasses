package TYSS_Arrays;

public class First_Max_And_SecondMax_Without_Bubble_Sorting {
	public static void main(String[] args) {
		int a[] = {10,1,2,9,8,7,8,5,2,0,1};
		int fmax=a[0];
		int smax=a[1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				fmax=a[i];
			}
//		}
//		for(int i=0;i<a.length;i++)
//		{
			if(a[i]>smax && a[i]!=fmax)
			{
				smax=a[i];
			}
		}	
		
		System.out.println(fmax);
		System.out.println(smax);
	}

}

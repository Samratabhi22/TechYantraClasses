package TYSS_Arrays;

public class First_Min_Without_Bubble_Sorting {

	public static void main(String[] args) {
		int a[] = {10,1,10,8,9,7,2,1,3,0};
		int fmin=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fmin)
			{
				fmin=a[i];
			}
		}
				
			System.out.println(fmin);	

	}

}

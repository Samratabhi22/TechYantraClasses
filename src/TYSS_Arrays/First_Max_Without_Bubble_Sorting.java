package TYSS_Arrays;

public class First_Max_Without_Bubble_Sorting {

	public static void main(String[] args) {
		int a[] = {10,9,8,7,0,1,2,3,4,5};
		int fmax=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				fmax=a[i];
			}
			
		}
		System.out.println(fmax);

	}

}

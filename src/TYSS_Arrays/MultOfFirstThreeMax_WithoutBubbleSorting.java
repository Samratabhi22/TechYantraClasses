package TYSS_Arrays;

public class MultOfFirstThreeMax_WithoutBubbleSorting {

	public static void main(String[] args) {
		int a[] = {10,2,5,1,5,3,4,1,4,6,7,8,10};
		int fmax=a[0];
		int smax=a[1];
		int tmax=a[2];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				tmax = smax;
                smax = fmax;
                fmax = a[i];
			}
			if(a[i]>smax && a[i]!=fmax)
			{
				tmax = smax;
                smax = a[i];
			}
			if( a[i]>tmax &&a[i]!=fmax && a[i]!=smax )
			{
				tmax=a[i];
			}
		}
			int prod=fmax*smax*tmax;
			
			System.out.println(fmax);
			System.out.println(smax);
			System.out.println(tmax);
			System.out.println("product of 3 max : "+prod);
		


	}

}

package TYSS_Arrays;

public class MultOfFirstThreeMin_WithoutBubbleSorting {

	public static void main(String[] args) {
		int a[] = {2,5,1,5,3,4,1,4,6,7,8,1};
		int fmin=a[0];
		int smin=a[1];
		int tmin=a[2];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<fmin)
			{
				tmin = smin;
                smin = fmin;
                fmin = a[i];
			}
			if(a[i]<smin && a[i]!=fmin)
			{
				tmin = smin;
                smin = a[i];
			}
			if( a[i]<tmin && a[i]!=fmin && a[i]!=smin )
			{
				tmin=a[i];
			}
		}
			int prod=fmin*smin*tmin;
			
			System.out.println(fmin);
			System.out.println(smin);
			System.out.println(tmin);
			System.out.println("product of 3 min : "+prod);
		

	}

}

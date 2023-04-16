package TYSS_Arrays;

public class First_Three_Min_Multiple_Numb_WIthout_Using_BubbleSorting {

	public static void main(String[] args) {
		int a[] = {5,3,0,1,4};
		int fmin=a[0];
		int smin=a[0];
		int tmin=a[0];
		for (int i = 0; i < a.length; i++) {
			if(fmin>a[i])
			{
				fmin=a[i];
			}
			if(a[i]>fmin && a[i] <smin)
			{
				smin=a[i];
			}
			if(a[i]>smin && a[i] <tmin)
			{
				tmin=a[i];
			}
			
		}
		int prod=fmin*smin*tmin;
		
		System.out.println(fmin);
		System.out.println(smin);
		System.out.println(tmin);
		System.out.println("prod is : "+prod);

	}

}

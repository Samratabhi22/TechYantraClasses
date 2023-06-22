package TYSS_JAVA;

public class Find_First_And_Second_Max_Numb_Without_Bubble_Sort {

	public static void main(String[] args) {
		int a[] = {5,3,0,1,4};
		int first_max=0;
		int sec_max=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>first_max)
				
			{   sec_max=first_max;
				first_max=a[i];
			}
			else if(a[i]>sec_max )
			{
				sec_max=a[i];
			}
			
		}
		System.out.println(first_max);
		System.out.println(sec_max);

	}

}

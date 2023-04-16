package TYSS_Arrays;

public class Find_First_And_Second_Min_Numb_Without_Bubble_Sort {

	public static void main(String[] args) {
		int a[] = {5,3,0,1,4};
		int first_min=a[0];
		int sec_min=a[0];
		for (int i = 0; i < a.length; i++) {
			if(first_min > a[i])
			{
				first_min=a[i];
			}
			if(a[i]>first_min && a[i]<sec_min)
			{
				sec_min=a[i];
			}
			
		}
		System.out.println(first_min);
		System.out.println(sec_min);
		

	}

}

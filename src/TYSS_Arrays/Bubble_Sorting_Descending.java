package TYSS_Arrays;

public class Bubble_Sorting_Descending {

	public static void main(String[] args) {
		int a []= {5,3,0,1,4};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]+" ");
		}
		

	}

}
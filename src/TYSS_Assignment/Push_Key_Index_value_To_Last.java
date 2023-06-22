package TYSS_Assignment;

public class Push_Key_Index_value_To_Last {

	public static void main(String[] args) {
		System.err.println("15--> push_Key_Index_value_To_Last");
		int[] a = {5,1,2,3,4};
		int key = 2;
		for (int i = 0; i < key; i++) {
			int first = a[0];
			for (int j = 0; j < a.length-1; j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		
		System.out.print("Expected The Array ---> [ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");

	}

}

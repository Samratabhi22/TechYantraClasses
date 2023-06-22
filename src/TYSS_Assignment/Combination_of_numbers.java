package TYSS_Assignment;

public class Combination_of_numbers {

	public static void main(String[] args) {
		System.err.println("8--> combination_of_numbers_whose_sum_is_11");
		int a [] = {1,3,5,2,8,9,10};
		//a+b=11----> 11-a[i]=b
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]+a[j]==11) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}

	}

}
 
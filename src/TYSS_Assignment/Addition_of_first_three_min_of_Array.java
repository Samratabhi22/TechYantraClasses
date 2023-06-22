package TYSS_Assignment;

public class Addition_of_first_three_min_of_Array {

	public static void main(String[] args) {
		//System.out.println("7--> addition_of_first_three_min_of_Array");
		int a[] = { 7,-6,11,9,0,4 };
		int firstMinmun = Integer.MAX_VALUE;
		int secondMinimun = Integer.MAX_VALUE;
		int thirdMinimun = Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < firstMinmun) {
				thirdMinimun = secondMinimun;
				secondMinimun = firstMinmun;
				firstMinmun = a[i];
			} else if (a[i] < secondMinimun && a[i] > firstMinmun) {
				thirdMinimun=secondMinimun;
				secondMinimun = a[i];
			} else if (a[i]<thirdMinimun && a[i] > secondMinimun) {
				thirdMinimun=a[i];
			}

	}
		int sum= firstMinmun+secondMinimun+thirdMinimun;
		System.out.println(firstMinmun);
		System.out.println(secondMinimun);
		System.out.println(thirdMinimun);
		System.out.println("sum is "+sum);

	}
}

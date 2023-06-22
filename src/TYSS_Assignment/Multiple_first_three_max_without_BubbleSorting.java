package TYSS_Assignment;

public class Multiple_first_three_max_without_BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 7, -3, 0, 2, 1, -9 };
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = a[i];
			} else if (a[i] > secondMax && a[i] < firstMax) {
				thirdMax = secondMax;
				secondMax = a[i];
			} else if (a[i] > thirdMax && a[i] < secondMax) {
				thirdMax = a[i];
			}
		}
//		System.out.println(firstMax);
//		System.out.println(secondMax);
//		System.out.println(thirdMax);
		System.out.println("Multiplication of first three max------> " + firstMax * secondMax * thirdMax);
	}

	}



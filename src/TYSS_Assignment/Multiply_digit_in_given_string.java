package TYSS_Assignment;

import java.util.ArrayList;

public class Multiply_digit_in_given_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("16--> multiply_digit_in_given_string");
		String str = "I a12m goi324ng t12o f124ind t120he pr5oduct of n236umbers ins242ide th25is str2ing2";
		int tempSum = 0;
		long multiplyResult = 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				int num = (int) str.charAt(i) - 48;
				tempSum = tempSum * 10 + num;
			} else {
				//System.out.println(tempSum);
				if (tempSum>0) {
					list.add(tempSum);
				}
				tempSum = 0;
			}
		}
		if (tempSum>0) {
			list.add(tempSum);
		}
		for (Integer integer : list) {
			//System.out.println(integer);
			multiplyResult=integer*multiplyResult;
		}
		System.out.println("Multiplication of numbers included in String---> "+multiplyResult);

	}

}

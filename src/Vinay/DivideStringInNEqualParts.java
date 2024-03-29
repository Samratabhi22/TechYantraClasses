package Vinay;

public class DivideStringInNEqualParts {
	public static void main(String[] args) {
		// declare string
		//String string = "aaaabbbbcc ccjh hvj khjh";
		String string = "My name is Abhishek Kumar";
		
		// if you want to divide the string irrespective of void spaces then disable
		// below code
		String str = string.replaceAll("\\s", "");

		// Stores the length of the string
		int len = str.length();
		System.out.println("length of string after removing spaces : "+len);
		
		// n determines the variable that divide the string in 'n' equal parts
		int n = 3;
		
		int temp = 0;
		int quotient = len / n;
		System.out.println("total parts string can be divided after removing spaces : "+quotient);
		
		// Stores the array of string
		String[] equalStr = new String[n];
		
		// Check whether a string can be divided into n equal parts
		if (len % n != 0) {
			System.out.println("Sorry this string cannot be divided into " + n + " equal parts.");
		} else {
			for (int i = 0; i < len; i = i + quotient) {
				// Dividing string in n equal part using substring()
				String part = str.substring(i, i + quotient);
				//here we are strings in string array
				//temp is a index value of string array
				equalStr[temp] = part;
				temp++;
			}
			System.out.println(n + " equal parts of given string are ");
			for (int i = 0; i < equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}
	}
}

package TYSS_Assignment;

public class Length_ofString_withoutLength_function {

	public static void main(String[] args) {
		System.err.println("14--> length_ofString_withoutLength_function");
		String s = "vinay";
		char[] strArr=s.toCharArray();
		int lengthOfString=0;
		for (char c : strArr) {
			lengthOfString++;
		}
		System.out.println("lengthOfString >>" + lengthOfString);

	}

}

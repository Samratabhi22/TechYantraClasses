package TYSS_Assignment;

public class Check_for_anagram_for_2_string {

	public static void main(String[] args) {
		System.err.println("18--> check_for_anagram_for_2_string");
		String str1="Listen";
		str1=str1.toLowerCase();
		String str2="silent";
		str2=str2.toLowerCase();
		
		if (str1.length()==str2.length()) {
			int sum1=0;
			int sum2=0;
			for (int i = 0; i < str1.length(); i++) {
				int asc1 = str1.charAt(i);
				int asc2 = str2.charAt(i);
				sum1=sum1+asc1;
				sum2=sum2+asc2;
			}
			if (sum1==sum2) {
				System.out.println("Given '"+str1+"' and '"+str2+"' are anagram words");
			}else {
				System.out.println("Strings are not anagram");
			}
		}else {
			System.out.println("Strings are not anagram");
		}

	}

}

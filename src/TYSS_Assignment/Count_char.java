package TYSS_Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Count_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("6--> count_char_and_print_format char:count");
		String s = "Malayalam";
		s=s.toLowerCase();
		HashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character character : set) {
			
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (character==s.charAt(i)) {
					count++;
				}
			}
			System.out.print(character+" : "+count);
		}
		System.out.println();
	}

}

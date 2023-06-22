import java.util.Iterator;
import java.util.LinkedHashSet;

public class CountNoOfVowelsInAStringWithoutDuplicates {

	public static void main(String[] args) {
		String st = "Engineer";
		String s = st.toLowerCase();
		char[] str = s.toCharArray();
		// LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length; i++) {

			set.add(str[i]);

		}
		int count = 0;
		for (char ch : set) {
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
				System.out.print(ch);

			}
			
		}
		System.out.print(" = "+count);
	}

}

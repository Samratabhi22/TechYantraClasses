package TYSS_Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Remove_duplicate_words_from_2_strings {

	public static void main(String[] args) {
		System.err.println("13--> remove_duplicate_words_from_2_strings");
		String str1 = "This is fun show";
		String[] str1Arr = str1.split(" ");
		String str2="fun tv show";
		String[] str2Arr = str2.split(" ");
		
		HashSet<String> set1 = new LinkedHashSet<String>();
		for (int i = 0; i < str1Arr.length; i++) {
			set1.add(str1Arr[i]);
		}
		for (int i = 0; i < str2Arr.length; i++) {
			if (set1.contains(str2Arr[i])) {
				set1.remove(str2Arr[i]);
			}else {
				set1.add(str2Arr[i]);
			}
		}
		
		for (String string : set1) {
			System.out.print(string+" ");
		}
		System.out.println();

	}

}

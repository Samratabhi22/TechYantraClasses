package TYSS_Assignment;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Occurance_of_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.err.println("4--> occurance_of_word");
		String str = "the trouble can't trouble me because i trouble the trouble";
		String [] strArr = str.split(" ");
HashSet<String>	set = new LinkedHashSet<String>();
		for (String string : strArr) {
			set.add(string);
		}
		
		for (String string : set) {
			int count = 0;
			for (int i = 0; i < strArr.length; i++) {
				if (string.equals(strArr[i])) {
					count++;
				}
			}
			if (count>0) {
				System.out.println(string+" is occuring "+count+" times");
			}
		}

	}

}

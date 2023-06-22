package TYSS_Assignment;

import java.util.HashSet;

public class  Count_and_Print_Alphabet{

	public static void main(String[] args) {
		
			//System.out.println("1--> Count_and_Print_Alphabet");
			String str = "aaabbcdddf"; // a3b2c1d3f1
			HashSet<Character> set = new HashSet<Character>();
			for (int i = 0; i < str.length(); i++) {
				set.add(str.charAt(i));
			}

			for (Character ch : set) {
				int count = 0;
				for (int i = 0; i < str.length(); i++) {
					if (ch == str.charAt(i)) {
						count++;
					}
				}
				System.out.print(ch + "" + count);
			}
			System.out.println();//just send cursor to next line for next method o\p
		}

	}



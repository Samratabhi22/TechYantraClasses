package TYSS_Assignment;

public class Reverse_the_word {

	public static void main(String[] args) {
		System.err.println("10--> reverse_the_words_in_sentense");
		String str = "I love programming";
		String[] strArr = str.split(" ");
		for (String string : strArr) {
			for (int i = string.length()-1; i >=0; i--) {
				System.out.print(string.charAt(i));
			}
			System.out.print(" ");
		}
		System.out.println();

	}

}

package TYSS_Assignment;

public class Reverse_word_and_sentense {

	public static void main(String[] args) {
		System.err.println("19--> reverse_word_and_sentense");
		String s ="my name is ok";
		String s1="";
		String [] strArr = s.split(" ");
		for (int i = strArr.length-1; i >=0; i--) {
			for (int j = strArr[i].length()-1; j >=0 ; j--) {
				s1=s1+strArr[i].charAt(j);
			}
			s1+=" ";
		}
		System.out.println(s1);

	}

}

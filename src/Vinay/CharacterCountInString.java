package Vinay;

public class CharacterCountInString {

	public static void main(String[] args) {
		String str = "Anupam";
		//1st method to count characters in string
		// we can use non-static method length() to get the numbers of char
		
		int stringLength = str.length();
		System.out.println("No. of CharactersInString : "+stringLength);
		
		//2nd method to count characters in string
		//we can convert it to char[] and find the no of char without using length()
		
		char[] chr=str.toCharArray();
		int charLength = chr.length;
		System.out.println(" No. ofCharacterInCharArray: "+charLength);
		
		//we can use for each to find the numbers of characters in Strings
		int count=0;
		for (char c : chr) {
			count++;
		}
		System.out.println("No. of CharactersInString: "+count);
	
	}
}

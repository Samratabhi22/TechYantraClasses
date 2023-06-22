import java.util.LinkedHashSet;

public class PositionOfEachCharacterInAString {

	public static void main(String[] args) {
		String st="Kannada"; 

		String s= st.toLowerCase();
		//LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			//set.add(s.charAt(i));
			System.out.println(s.charAt(i)+" is present in "+(i+1)+" position");
			
		}

	}

}

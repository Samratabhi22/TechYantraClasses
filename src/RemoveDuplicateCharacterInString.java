import java.util.LinkedHashSet;

public class RemoveDuplicateCharacterInString {

	public static void main(String[] args) {
		String s="Kannada"; 

		String st= s.toLowerCase();
		
		//System.out.println(st);
		
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		
		
		for (Character ch : set) {
			System.out.print(ch+" ");
		}
		
     }

}

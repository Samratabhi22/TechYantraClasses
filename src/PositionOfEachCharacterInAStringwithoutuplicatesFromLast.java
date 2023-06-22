import java.util.LinkedHashSet;

public class PositionOfEachCharacterInAStringwithoutuplicatesFromLast {

	public static void main(String[] args) {
		String st="Kannada"; //k=1 a=2 n=3 d=6

		String s= st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		for (Character ch : set) {
			//System.out.println(ch+" ");
			int count =0;
			for (int i = s.length()-1; i >=0; i--) {
				if(ch==s.charAt(i))
				{
					System.out.println(s.charAt(i)+" is present in "+(i+1)+" position");
					break;
				}
				
			}

	}

	}

}

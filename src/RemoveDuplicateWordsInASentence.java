import java.util.LinkedHashSet;

public class RemoveDuplicateWordsInASentence {

	public static void main(String[] args) {

		
		String s="I am I am a Software Engineer Engineer";
		String st[]= s.split(" ");
		//String s= st.toLowerCase();
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < st.length; i++) {
			set.add(st[i]);
			
		}
		for (String str : set) {
			//System.out.println(ch+" ");
			System.out.print(str+" ");
			
			
			
		

	}
		
}
}

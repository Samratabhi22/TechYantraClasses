

public class CountNoOfVowelsInAString {

	public static void main(String[] args) {
		String st="Engineer";
		
		int vowels=0;
		int consonants=0;
		for (int i = 0; i < st.length(); i++) {
			char ch =st.charAt(i);
			
		    if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u')
		    {
		    	vowels++;
		    	
		    }
		    else if(ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U')
		    {
		    	vowels++;
		    }
		    else
		    {
		    	consonants++;
		    }
			
		}
		
		System.out.println("vowels :"+vowels );
		System.out.println("consonants :"+consonants );
				


	}

}

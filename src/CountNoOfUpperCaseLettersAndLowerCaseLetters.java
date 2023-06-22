
public class CountNoOfUpperCaseLettersAndLowerCaseLetters {

	public static void main(String[] args) {
		String s="SofTwArE";
		int uppercase=0;
		int lowercase=0;
		for (int i = 0; i < s.length(); i++) {
			char ch =s.charAt(i);
		    if(ch>='a' && ch<='z')
		    {
		    	lowercase++;
		    	
		    }
		    else if(ch>='A' && ch<='Z' )
		    {
		    	uppercase++;
		    }
			
		}
		System.out.println("uppercaseletter :"+uppercase );
		System.out.println("lowercaseletter :"+lowercase );
				

	}

}

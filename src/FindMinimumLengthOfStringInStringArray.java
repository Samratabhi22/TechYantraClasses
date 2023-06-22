
public class FindMinimumLengthOfStringInStringArray {

	public static void main(String[] args) {
		String[] s= {"abc","dv", "abcdd","abcd","ab"};
	String min_length=s[0];
		for (int i = 0; i < s.length; i++) {
			if(min_length.length()>s[i].length())
				//	if(min_length.length()<s[i].length())
			{
				min_length=s[i];
			}
		}
		System.out.println(min_length);

	
		//for  2 same min length
//	String[] s= {"abc","dv","abcdd","abcd","ab"};
//	String min_length=s[0];
	for (int i = 0; i < s.length; i++) {
		if(min_length.length()==s[i].length())
		{
			System.out.println(s[i]+" ");
		}
	}
	
	

}
}


public class StringPalindrome {

	public static void main(String[] args) {
	String s = "adam";
	String rev="";
	
	for (int i = s.length()-1; i >=0; i--) {
		rev=rev+s.charAt(i);
		
	}
	if(rev.equals(s))
	{
		System.out.println("it is a palindrome");
	}
	else
	{
		System.out.println("it is not a palindrome");
	}

	}

}

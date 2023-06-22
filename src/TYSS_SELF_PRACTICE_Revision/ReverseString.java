package TYSS_SELF_PRACTICE_Revision;

public class ReverseString {

	public static void main(String[] args) {
		String s= "Abhishek";
	s=s.toLowerCase();
	char[] ch = s.toCharArray();
	for(int i = ch.length-1; i>=0;i--)
	{
		System.out.print(ch[i]);
	}
	

	}

}

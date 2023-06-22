package TYSS_SELF_PRACTICE_Revision;

public class PatternName {

	public static void main(String[] args) {
	String s="Abhishek";
	s=s.toLowerCase();
	for(int i=0;i<s.length();i++)
	{
		for(int j=0;j<s.length();j++)
		{
			if(i==j) {
				System.out.print(s.charAt(i));
			}
			else
			{
				System.out.print(" ");
			}
			
		}
		System.out.println("");
	}

	}

}

package TyssHomework;

public class StringClassHome {

	public static void main(java.lang.String[] args) {
		String s= "hi abhi";
		char a = s.charAt(0);
		System.out.println(a);
		System.out.println(s.charAt(0));
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}
		
		char[] ch = s.toCharArray();
		System.out.println("******");
		System.out.println(ch[0]);
	for (int i = 0; i < ch.length; i++) {
		System.out.print(ch[i]);
		
	}
		

	}

}

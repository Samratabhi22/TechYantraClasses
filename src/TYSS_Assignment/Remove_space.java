package TYSS_Assignment;

public class Remove_space {

	public static void main(String[] args) {
		System.err.println("9--> remove_space");
		String s = "my name is abc";
//		String[] str = s.split(" ");
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!=' ') {
				s1 = s1 + s.charAt(i);
			}
		}
//		for (String string : str) {
//			System.out.print(string);
//		}
		System.out.println(s1);

	}

}


public class ReverseString {

	public static void main(String[] args) {
		String str= "software";

		String rev="";

//		for(int i=str.length()-1;i>=0;i--) {
//		rev=rev + str.charAt(i);
//		}
//	
//		System.out.println(rev);
		
		//2nd method
//		char[] str1=str.toCharArray();
//		//int count=0;
//		for (int i = str.length()-1; i >=0; i--) {
//			
//			System.out.print(str.charAt(i));
//		}
		// 3rd method using toCharArray
		char[] str1=str.toCharArray();
		for (int i = str1.length-1; i >=0 ; i--) {
			System.out.print(str1[i]);
		}
//		char[] str2 =str.toCharArray();
//		int count =0;
//		for (char c : str2) {
//			count++;
//		}
//		for (int i = count-1; i >=0; i--) {
//			System.out.print(str2[i]);
//			
//		}
		
		//5 using String builder
//		StringBuilder build= new StringBuilder("software");
//				
//				System.out.println(build.reverse());
			
		

	}

}


public class ReverseWordsInString {

	public static void main(String[] args) {
		String s= "I am a software engineer";//I ma a erawtfos reenigne
		String [] st =s.split(" ");// Iamasoftwareengineer
		for(int i= 0; i<st.length;i++)
		{
			String str=st[i];
			//System.out.print(str);//Iamasoftwareengineer
			for (int j =str.length()-1; j >=0 ; j--) {
				//i= 0 0<5 true st[i]= I
				//i= 1 1<5 true st[i]= am
				//i= 2 2<5 true st[i]= a
				//i= 3 3<5 true st[i]= software
				//i= 4 4<5 true st[i]= engineer
				
				
		System.out.print(str.charAt(j))	;		//I ma a erawtfos reenigne
				}
	System.out.print(" ");
			
		}

	}

}

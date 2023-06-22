
public class RemoveSpaceBtwnString {

	public static void main(String[] args) {
//		String s= "I am a software engineer";
		//reverse the string and than remove space
		//engineersoftwareaamI
//		String [] st =s.split(" ");
//		for (int i = st.length-1;i>=0;i--) {
//			System.out.print(st[i]);
			
//		}
// 2nd method
		String s= "I am a software engineer";//Iamasoftwareengineer
		String [] st =s.split(" ");
		for(int i= 0; i<st.length;i++)
		{
			System.out.print(st[i]);
		}
	}

}

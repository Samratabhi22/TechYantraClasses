package TyssHomework;

public class REverse {

	public static void main(String[] args) {
		String s="I am a software engineer";
		String st []=s.split(" ");
		//String rev="";
		for(int i=0;i<st.length;i++)
		{
			String str=st[i];
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.print(str.charAt(j));
		}
	
			System.out.print(" ");
	}
		
}

}
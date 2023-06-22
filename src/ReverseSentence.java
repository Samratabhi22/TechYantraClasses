
public class ReverseSentence {

	public static void main(String[] args) {
		String s= "I am a software engineer";//engineer software a am I
		String[] st= s.split(" ");
		for (int i = st.length-1;i>=0;i--) {
			System.out.print(st[i]+" ");
			
		}

	}

}

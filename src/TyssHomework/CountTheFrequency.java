package TyssHomework;

public class CountTheFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabbbcdddf";
	int count;
		String strarray[]=str.split("");
		for(int i=0;i<strarray.length;i++) {
			
		
	count=0;
			for(int j=0;j<strarray.length;j++) {
			if(strarray[i].equalsIgnoreCase(strarray[j])) {
				count++;
				
				//System.out.print(strarray[i]+count);
			}
		//	System.out.print(strarray[i]+count);
			
			}	
			System.out.print(strarray[i]+count);
		}
		
	}

}

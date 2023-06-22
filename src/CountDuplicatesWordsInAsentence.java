import java.util.LinkedHashSet;

public class CountDuplicatesWordsInAsentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String string = "I am I am a software engineer doing engineer I am software";    
	          string = string.toLowerCase();    
	            
	         
	        String words[] = string.split(" ");    
	            
	        System.out.println("Duplicate words in a given string : ");  
	        int count;   
	        for(int i = 0; i < words.length; i++) {    
	            count = 0;    
	            for(int j = i+1; j < words.length; j++) {    
	                if(words[i].equals(words[j])) {    
	                    count++;    
	                    //Set words[j] to 0 to avoid printing visited word    
	                    words[j] = "0";    
	                }    
	            }  
	            //Displays the duplicate word if count is greater than 1    
	            if(count > 0 && words[i] != "0")    
	                System.out.print(words[i]+" ");
		

}
}
}

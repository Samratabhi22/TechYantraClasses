package TyssHomework;

public class Practise1 {
public static void main(String [] args)
	{
//        String str = " my name is ok ";
//     String str1=str.trim();
      // String str2 []=str1.split(" ");
//        for (int i = 0; i < str2.length; i++) {
//        	System.out.print(str2[i]);
//			
//		}
 
        // Call the replaceAll() method
       // str = str.replaceAll("\\s", "");

       // System.out.println(str);
//     
//     for(int i=str1.length()-1;i>=0;i--)
//     {
//    	 //System.out.print(str1.charAt(i));
//    	// break;
//    	// String str2 []=str1.split(" ");
//    	 
//    	 
//    	 
//     }
     
     String rev="my name is ok";
     String s[] = rev.split(" ");
     String  nstr="";
     char ch;
    
  
   for (int i=0; i<s.length; i++)
	   
   {
	   for(int j=0;j<i;j++) {
     ch= s[i].charAt(j); //extracts each character
     nstr= ch+nstr; //adds each character in front of the existing string
   }
   }
   System.out.println("Reversed word: "+ nstr);
 }

        
    }



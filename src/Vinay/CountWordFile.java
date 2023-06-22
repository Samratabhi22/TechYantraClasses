package Vinay;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordFile {

	public static void main(String[] args) throws IOException {
		 String line;  
	        int count = 0;  
	  
	        //Opens a file in read mode  
	        FileReader file = new FileReader("C:\\Users\\Hp\\Desktop\\TestNgInterviewQuestionsRahulShetty.txt");  
	        BufferedReader br = new BufferedReader(file);  
	  
	        //Gets each line till end of file is reached  
	        while((line = br.readLine()) != null) {  
	        	//System.out.println("Lines are "+line);
	        	
	            //Splits each line into words  
	            String words[] = line.split(" ");  
	         //   System.out.println("Words in line  : "+words);
	            //Counts each word  
	            count = count + words.length;  
	  
	        }  
	  
	        System.out.println("Number of words present in given file: " + count);  
	        br.close();  
	    }  

	}



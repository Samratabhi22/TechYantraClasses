package TYSS_Arrays;
import java.util.*;

public class AppendZerosINTheLast {
	
	
	   public static void main(String[] args){
	      
//	      //Declare and initialize the array elements
//	      int array[] = {50,128, 0, 99, 67, 50, 0, 29, 7, 0};
//	      
//	      //getting length of an array
//	      int n = array.length;
//	      
//	      //calling user defined function
//	      func(array, n);
//	   }
//	   
//	   //user defined method
//	   public static void func(int array[], int n) {
//	   
//	      //sorting the array elements
//	      Arrays.sort(array);
//	     // System.out.println(array);
//	      System.out.println("Elements of array after moving all the zeros to the end of array: ");
//	      
//	      //prints array using the for loop
//	      for (int i = n-1; i >= 0; i--) {
//	         System.out.print(array[i] + " ");
		   int a [] = {4,45,25,0,2,0,87};
		   for (int i = 0; i < a.length; i++) {
			   for (int j = i+1; j < a.length; j++) {
				if(a[i]==0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			   System.out.println(a[i]);
			
		}
	      }
	   }
	



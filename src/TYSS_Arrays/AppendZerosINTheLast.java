package TYSS_Arrays;
import java.util.*;

public class AppendZerosINTheLast {
	
	
	   public static void main(String[] args){
	      

		   int a [] = {0,4,45,25,0,2,0,87};
		   for (int i = 0; i < a.length; i++) {
			   for (int j = i+1; j < a.length; j++) {
				if(a[i]==0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			   System.out.print(a[i]+" ");
			
		}
	      }
	   }
	



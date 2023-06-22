package TYSS_Arrays;

public class AppendZerosINTheLastWithoutSorting {

	public static void main(String[] args) {

	      //Declare and initialize the array elements
	      int a[] = {3, 9, 5, 1, 0, 0, 11, 6, 0, 9};
	      
	      //getting length of an array
	     // int n = arr.length;
	      
	     
	      // Count of non-zero elements
	      int count = 0;
	      
	      //shifting non zero element to the left of the loop
	      for (int i = 0; i < a.length; i++)
	      {
	      if (a[i] != 0)
	      {
	      a[count] = a[i];
	      count++;
	      }
	      }
	      //adding the zeros to the end
	      while (count < a.length)
	      {
	      a[count] = 0;
	      count++;
	      }
	      
	      //printing the result
	      System.out.println("Elements of array after moving all the zeros to the end of array: ");
	      for (int i = 0; i < a.length; i++)
	      System.out.print(a[i] + " ");
	   }

	}



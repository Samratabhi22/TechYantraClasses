package TYSS_Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,7,8,9};
		int b[] = {2,3,4,5,0,2};
		
		
		int c[] = new int [a.length+b.length];
		int k=0;
		for( int i =0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for( int i =0;i<b.length;i++)
		{
			c[k]=b[i];
			k++;
			
		}
		for( int i =0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
			
		}
		

	}

}

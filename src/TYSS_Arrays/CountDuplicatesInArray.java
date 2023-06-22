package TYSS_Arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CountDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,5,4,1,5,2,3,0,0};
		
		
		
		//TreeSet<Integer> set	=new TreeSet<Integer>();
		
   //HashSet<Integer> set	=new HashSet<Integer>();
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		//insertion order not maintained
		
		
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
			
		}
		for (int e : set) {
			int count=0;
			for(int i=0;i<a.length;i++)
			{
			if(e==a[i])
			{
				count++;
			}
		}
			if(count>1)
			{
				System.out.println(e+" count : "+count);
			}

	}

}
}

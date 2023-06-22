package TYSS_Arrays;

import java.util.LinkedHashSet;

public class PrintPositionInWithoutDuplicates {

	public static void main(String[] args) {
		int[] a = {4,5,4,1,2,3,5};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
			
		}
		for (int e : set) {
			
			for(int i=0;i<a.length;i++)
			{
				if(e==a[i])
				{
					System.out.println(e+" position is  "+(i+1));
					break;
				}
			}

	}

}
}

package TYSS_Arrays;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInAArray {

	public static void main(String[] args) {
		int[] a= {4,5,4,1,5,2,3};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
			
		}
		for (int e : set) {
			System.out.println(e+" ");
		}

	}

}

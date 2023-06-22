package TYSS_Assignment;

import java.util.HashMap;

public class Addition_09_using_hashMap {

	public static void main(String[] args) {
		System.err.println("12--> addition_09_using_hashMap_1");
		int [] a = {7,2,12,15}; //o\p=9
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
					map.put(i, a[i]);
			
		}
		int indexI=0;
		int indexJ=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]+a[j]==9) {
					indexI=i;
					indexJ=j;
				}
			}
		}

		System.out.println("result >> "+(map.get(indexI)+map.get(indexJ)));
	}
}

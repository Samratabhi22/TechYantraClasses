package TyssHomework;

public class ThreeMinuimumNumber {
public static void main(String []args) {
	int array[]= {10,20,30,-41,44,0,2};
	int temp=0;
	for(int i=0;i<array.length;i++) {
		for(int j=i+1;j<array.length;j++) {
			if(array[j]<array[i]) {
				temp=array[j];
				array[j]=array[i];
				array[i]=temp;
			}
		}
		if(i<3) {
			System.out.println(array[i]);
		}
	}
}
}

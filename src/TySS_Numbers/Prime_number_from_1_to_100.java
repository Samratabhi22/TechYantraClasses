package TySS_Numbers;

public class Prime_number_from_1_to_100 {

	public static void main(String[] args) {
		System.err.println("20--> prime_number_from_1_to_100");
		//Scanner s = new Scanner(System.in);
		//System.out.println("Enter a Limit to Print Prime number");
		//int n = s.nextInt();
		int n=100;
		int a=1;
		boolean flag = false;
		System.out.print("Prime Number from 1 to 100 --->[ ");
		while (a<n) {
			for (int i = 2; i <= a/2; i++) {
				if (a%i==0) {
					flag=true;
					break;
				}
			}
			if (!flag) {
				System.out.print(a+" ");
			}
			a++;
			flag=false;
		}
		System.out.println("]");
		//s.close();

	}

}

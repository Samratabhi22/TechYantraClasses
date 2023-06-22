package TYSS_Assignment;

public class Multiply_each_digit_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("17--> multiply_each_digit_in_a_string");
        //Scanner scanner = new Scanner(System.in);
        String str="v1i2n3ay4 p5ri1ya23n5k7a";
        int len, x, mul=1;
        //System.out.println("Enter a string : ");
        //str = scanner.nextLine();
        len = str.length();
        for(int i=0;i<len;i++){
            x = str.charAt(i) - '0';
            if(x>=0 && x<=9){
                mul *= x;
            }/*else{
                continue;
            }*/
        }
        System.out.println("Multiplication : " + mul);
        //scanner.close();

	}

}

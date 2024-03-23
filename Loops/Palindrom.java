import java.util.Scanner;
class Palindrom{

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int duplicate = number;
		int reverse = 0;

		while(number>0){

			int rem = number % 10;
			reverse = reverse * 10 + rem ;
			number /=10 ;
		}
		if (duplicate == reverse) {
			System.out.println("The Entered Number is a Palindrom");
		}else{
			System.out.println("The Entered Number is Not a Palindrom");
		}
	}
}

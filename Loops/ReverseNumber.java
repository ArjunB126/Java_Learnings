import java.util.Scanner;

class ReverseNumber{
	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int rev = 0;

		while(number>0){

			int rem = number % 10;
			rev = rev * 10 + rem;
			number /= 10;
		}
		System.out.println("Your Reversed Number Is: "+ rev);
	}
}
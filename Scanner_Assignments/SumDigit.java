import java.util.Scanner; 

class SumDigit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Value Between 0 to 1000:");
		int number = sc.nextInt();

		int digit1 = number%10;
		int digit2 = (number / 10)%10;
		int digit3 = (number / 100)%10;

		int sum = digit1 + digit2 + digit3;

		System.out.println("The Sum of Digits is:" + " " + sum);
	}
}
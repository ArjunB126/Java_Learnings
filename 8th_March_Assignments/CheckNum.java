import java.util.Scanner;

class CheckNum 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();

		System.out.println((number >= 0 && number <= 9) ? "Is a digit" : "Is Not A Digit");
	}
}

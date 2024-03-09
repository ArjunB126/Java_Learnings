
import java.util.Scanner;

class GreaterNumber{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1 Value:");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2 Value:");
		int num2 = sc.nextInt();
		int min = (num1>num2)?num1:num2;

		System.out.println(num1 + ","+ num2 + " Great among 2 is" + " " + min);
	}
}
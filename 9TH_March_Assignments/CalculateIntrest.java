import java.util.Scanner;

class CalculateIntrest
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Heyy User Enter Your Balance : ");
		double balance = sc.nextDouble();
		System.out.println("Enter Intrest Rate ( Example :4.5 % ) : ");
		double intrestRate = sc.nextDouble();

		// Intrest on next Monthly Payment 
		double monthlyIntrest = balance * (intrestRate / 1200);

		System.out.println("Your Intrest On Next Monthly Payment is :" + monthlyIntrest);
	}
}
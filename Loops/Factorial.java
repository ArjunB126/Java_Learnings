import java.util.Scanner;
class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = sc.nextInt();
		int fact = 1;

		for (int i = number; i>=1 ; i--) {
			
			fact = fact * i;
		}

		
		System.out.println("The Sum of Factorial is:" + " " + fact );
	}

}
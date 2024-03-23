import java.util.Scanner;
class ReverseNumberString{

	public static void main(String[] args) {
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String rev = "";

		while(number>0){

			int rem = number % 10;
			rev = rev + rem ;
			number /=10 ;
		}
		System.out.println("Your Reversed Number Is: "+ rev);
	}
}

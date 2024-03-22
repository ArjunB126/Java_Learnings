import java.util.Scanner;

class Length_Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		int duplicate = number; // Bcz we later needed num
		int power = 1;
		int length = 0;

		while(number>0){
			length++;
			number = number/10; // num/=10
		}

		for (int i = 1;i<=length ;i++ ) {
			power = power * duplicate;  // power*=10

		}
		System.out.println("The Length of th Given Number is: "+ length);
		System.out.println("The Power of th Given Number is: "+ power);
	}
}
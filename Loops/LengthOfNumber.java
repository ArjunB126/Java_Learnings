import java.util.Scanner;

class LengthOfNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number Whose lenght you want to Check: ");
		int num = sc.nextInt();
		int lenght = 0;

		for (int i = num; i>0 ;i /=10 ) {
			lenght++;
		}
		System.out.println(lenght);
	}
}
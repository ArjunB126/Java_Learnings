
import java.util.Scanner;

class CheckNumLadder{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entered Number Is Positive Or Negative :");
		int number = sc.nextInt();
		if (number>0) {
			System.out.println("The Given Number Is Positive");
		}else if(number == 0){
			System.out.println("The Given Number Is Neutral");
		}else{
			System.out.println("The Given Number Is Negative");
		}
	}
}
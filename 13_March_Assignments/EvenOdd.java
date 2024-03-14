// Check Weathere the number is even or odd 

import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number You Wanna Check That Even Or Odd :");
		int number = sc.nextInt();
		if (number%2==0) {
			System.out.println("The Given Number Is Even");
		}else{
			System.out.println("The Given Number Is Odd");
		}
	}
}
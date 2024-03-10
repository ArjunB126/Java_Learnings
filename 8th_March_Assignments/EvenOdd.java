// Famous Interview Question: Tell The Number is Even Or Odd Without Using Modulus Operator 

import java.util.Scanner;


class EvenOdd{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit");
		double num = sc.nextDouble();

		// Without Using Moduls [ % ] Operator

		System.out.println(((num/2)*2 == num)?"Odd":"Even");
}
}




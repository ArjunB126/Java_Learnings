import java.util.Scanner;

class PoundToKilogram
{
	public static void main(String[] args)
	 {
	 	Scanner sc = new Scanner (System.in);
		System.out.print("Enter The Weight in Pounds:" + " ");
		double weight = sc.nextDouble();
		double result = weight*0.454;

		System.out.println( weight + " "+ "is" +" " + result + " "+ "kilograms");
	}
}
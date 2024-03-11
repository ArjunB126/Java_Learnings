import java.util.Scanner;


class CostOfDriving
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Travelling Distance: ");
		double distance = sc.nextDouble();
		System.out.println("Enter miles per Gallon: ");
		double milesPerGallon = sc.nextDouble();
		System.out.println("Enter Price Per Gallon: ");
		double pricePerGalon = sc.nextDouble();

		double totalCost = ( distance / milesPerGallon) * pricePerGalon;
		System.out.println("The Total Cost Of The Trip is: $" + totalCost);
	 }
}
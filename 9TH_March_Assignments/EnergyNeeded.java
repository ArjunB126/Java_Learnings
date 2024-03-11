import java.util.Scanner;

class EnergyNeeded
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount of Water in Kg");
		double water = sc.nextDouble();
		System.out.println("Enter the Initial Temprature of Water in Celsius");
		double intialTemprature = sc.nextDouble();
		System.out.println("Enter the Final Temprature of Water in Celsius");
		double finalTemprature = sc.nextDouble();

		double energyNeeded = water * ( finalTemprature - intialTemprature )*4184;

		System.out.println("The Entered amount of water is:" + water);
		System.out.println("The Intial Temprature of Water is:" + intialTemprature);
		System.out.println("The Final Tempratureof Water is:" + finalTemprature);
		System.out.println("The Energy Needed is:" + energyNeeded);
		
		

	}
}
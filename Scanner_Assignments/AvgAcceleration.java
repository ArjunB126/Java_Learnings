import java.util.*;

class AvgAcceleration{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Staring Velocity V0 in meters/second:");
		double v0 = sc.nextDouble();
		System.out.println("Enter the Ending Velocity V1 in meters/second:");
		double v1 = sc.nextDouble();
		System.out.println("Enter the Time Span in second:");
		double timeSpan = sc.nextDouble();
		double avgAcceleration = (v1 - v0) / timeSpan;

		System.out.println("The Average Acceleration is:" + " "+ avgAcceleration);

	}

}
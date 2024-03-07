import java.util.*;


class FeetToMeter 
{

public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value Of Feet " + " ");
		double feet = sc.nextDouble();
		double result = feet*0.3048;

		System.out.println( feet + " " + "is" + " " + result + "in meters");
	}

}
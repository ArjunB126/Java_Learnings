// Area Of Hexagon 

import java.util.*;
class AreaOfHexagon
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the One Side of Hexagon :");
		double side = sc.nextDouble();

		double area = 3*((2*2)/2)*(side * side);
		System.out.println("The Area of Hexagon Is :"+ area);
	}
}
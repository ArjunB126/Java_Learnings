// Write a java program to find the area of a circle  whose radius is 2.5 cm ( pie r sq)


class AreaOfCircle

{

	public static void main ( String [] args )
	{
		double radius = 2.5;
		final double pi = 3.14;
		double area = pi*(radius*radius);

		System.out.println("The Area of Circle is :" + " " + area +" " + "cm^2");
	}
}
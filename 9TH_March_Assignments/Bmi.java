import java.util.Scanner;

class Bmi
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey User Enter the Weight in Pounds");
		double weight = sc.nextDouble();
		System.out.println("Enter the Height in Inches ");
		double height = sc.nextDouble();


		double weightConversion = weight * 0.45359237;
		double heightConversion = height * 0.0254;

		double bmi = weightConversion/ ( heightConversion * heightConversion);

		System.out.println("Your Weight in Kg is :" + weightConversion);
		System.out.println("Your Heigh in Meters is: " + heightConversion);
		System.out.println("Based On Your Heigh and Weight Your Body Mass Index [BMI ]is :" + bmi);
		
		

	}
}
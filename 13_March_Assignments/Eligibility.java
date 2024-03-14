import java.util.Scanner;
class Eligibility
{

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Your Percentage ");
		  double percentage = sc.nextDouble();
		  if (percentage>=60){
		  	System.out.println("You Are Eligible For The Interview");
		  }else{
		  	System.out.println("You Are Not Eligible For The Interview");
		  }

	}
}
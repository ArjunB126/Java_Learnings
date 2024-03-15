// charAt method 
                            
import java.util.Scanner;

class ScannerExample
{


	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Name:" + " ");
		String name = sc.next().toLowerCase();
		char ch = name.charAt(0);
		System.out.println("Hi " + name + " The first Charecter of Your Name is:" + " " + ch);
		
		if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
		{

			System.out.println(" Charecter " + ch + " " + "is a vowel");

		}

		else {

			System.out.println(" Charecter " + ch + " " + "is a Consonent");		
	
		}


		

	}





}


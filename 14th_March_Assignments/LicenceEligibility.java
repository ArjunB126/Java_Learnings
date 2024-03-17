import java.util.Scanner;

class LicenceEligibility{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age = sc.nextInt();
		if (age>18) {
			System.out.println("Have You Passed The RTO Test With 60 marks ? ( Yes / No ):");
			String ans = sc.next().toUpperCase();
			if (ans.equals("YES")) {
				System.out.println("You Are Eligible For The Licence");
			}else{
				System.out.println("Ja Beta Pehle Test Clear Kr Fhir Ana Yaha License Nikalne");
			}

		}else{
			System.out.println("Jaldi Yaha Se Hatoo and try after " + (18 - age ) + " " + "Years");
		}

	}
}
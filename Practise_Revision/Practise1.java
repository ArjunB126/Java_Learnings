import java.util.Scanner;

class Practise1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Age: ");
	int age = sc.nextInt();
	if (age>18) {
		System.out.println("Enter Your Current Resident City:");
		String city = sc.next().toUpperCase();
		String default_city = "PUNE";
		if (city.equals(default_city)){
			System.out.println("You Are Eligible to apply for this Job");
		}else{
			System.out.println("You are not Eligible");
		}
	}else{
		System.out.println("You Are Not The Right Fit For This Job");
	}
}

}
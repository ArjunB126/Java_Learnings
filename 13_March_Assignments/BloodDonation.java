
import java.util.Scanner;

class BloodDonation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = sc.nextInt();
        System.out.println("Enter Your Weight:");
        int weight = sc.nextInt(); 
        System.out.println("Have You Consumed Cigarette Or Alcohol in the last 24 hours [Yes/No]:");
        String answer = sc.next().toLowerCase();

        if (age >= 20 && weight >= 50 && answer.equals("no")) {
            System.out.println("You Are Eligible To Donate Blood");
        } else {
            System.out.println("You are not eligible to donate Blood");
        }
    }
}

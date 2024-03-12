import java.util.Scanner;

class LoveMarraige {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        System.out.println("Enter Your Surname");
        String surname = sc.next().toUpperCase();
        System.out.println("Enter Your Income:");
        double income = sc.nextDouble();

        String alreadySurname = "AMBANI";

        System.out.println("Hello Your Age is:" + age);
        System.out.println("Your Surname is:" + surname);
        System.out.println("Your Income is:" + income);

        if (age >= 21 && income >= 10000000 || surname.equals(alreadySurname) ) {
            System.out.println("You Are Eligible To Marry");
        } else {
            System.out.println("You Are Not Eligible to Marry");
        }
    }
}

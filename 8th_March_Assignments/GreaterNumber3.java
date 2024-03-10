import java.util.Scanner;

class GreaterNumber3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 Value:");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 Value:");
        int num2 = sc.nextInt();
        System.out.println("Enter the num3 Value:");
        int num3 = sc.nextInt();

        int largest = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3 ? num2 : num3);

        System.out.println(num1 + ", " + num2 + ", " + num3 + " The largest among 3 is " + largest);
    }
}

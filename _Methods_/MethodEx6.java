// Check the given number from input is emirp Number or not , Check first prime or not if prime reverse check if reversed number is prime or not if prime then it is a emirp number else not 





import java.util.Scanner;

class MethodEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            int reversed = reverseNumber(num);
            if (isPrime(reversed) && num != reversed) {
                System.out.println("The number is an emirp number.");
            } else {
                System.out.println("The number is prime but not an emirp number.");
            }
        } else {
            System.out.println("The number is not prime.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}

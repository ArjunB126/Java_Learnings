// Armstrong Number Codeee 

import java.util.*;
class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter The Number");
        int number = sc.nextInt();
        int duplicate = number;
        int duplicate_1 = number; 
        int sum = 0;
        int length = 0;

        while(number!=0) {
            length++;
            number/=10;
        }

        while(duplicate>0) 
        { 
            int reminder = duplicate % 10;
            int power = 1;
            for (int i = 1; i <= length; i++) {
                power = power * reminder;
            }

            sum += power; 

            duplicate /= 10; 
        }
        
        if (sum == duplicate_1) {
            System.out.println("The Given Number is Armstrong Number");
        } else {
            System.out.println("The Given Number is Not an Armstrong Number");
        }
    }
}

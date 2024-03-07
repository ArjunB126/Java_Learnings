
import java.util.Scanner;

 class MinutesToYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

       
        final int minutesInDay = 60 * 24;
        final int daysInYear = 365;

        // Calculate years and remaining days
        long years = minutes / (minutesInDay * daysInYear);
        long Days = (minutes / minutesInDay) % daysInYear;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + Days + " days.");

    
    }
}

import java.util.Scanner;

class RunwayLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Plane's Acceleration in meters/second:");
        double acceleration = sc.nextDouble();
        System.out.println("Enter Plane's Take Off Speed in meters/second: ");
        double takeoffSpeed = sc.nextDouble();

        double lengthOfRunway = (takeoffSpeed * takeoffSpeed) / (2 * acceleration);

        System.out.println("The Minimum Runway Length Should Be: " + lengthOfRunway + " meters");
    }
}

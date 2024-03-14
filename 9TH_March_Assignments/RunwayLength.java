// [ Doubt Ask To Sir ]


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


// 	Expected Answer : 514.286 Speed : 60 Acceleration: 3.5    Output: The Minimum Runway Length Should Be: 0.10208333333333333 meters


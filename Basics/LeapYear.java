import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Year:");
        int year = in.nextInt();
        if (year % 4 == 0 || year % 400 == 0 && year % 100 !=0) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }
}

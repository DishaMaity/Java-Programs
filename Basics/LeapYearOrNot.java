import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int n = in.nextInt();
        if (((n%4==0) && (n%100!=0)) || (n%400==0)){
            System.out.println("The Year is a Leap year");
        }
        else{
            System.out.println("The Year is not a Leap year");
        }

    }
}

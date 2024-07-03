import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value for Principle : ");
        int P = in.nextInt();
        System.out.print("Enter the value for Time : ");
        int T = in.nextInt();
        System.out.print("Enter the value for Rate : ");
        int R = in.nextInt();
        int SI = (P * R * T) / 100 ;
        System.out.println("Simple Interest = "+ SI);
    }
}

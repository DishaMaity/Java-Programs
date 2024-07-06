import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value : ");
        int n = in.nextInt();
        System.out.print("Enter power : ");
        int x = in.nextInt();

        System.out.println("Power = " + power(n,x));
    }

    static double power (double n, double x) {
        return Math.pow(n,x);
    }
}

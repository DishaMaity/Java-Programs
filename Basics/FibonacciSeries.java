import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Range for Fibonacci Series : ");
        int n = in.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        while ((n-2) != 0) {
            int n3 = n1+n2;
            System.out.println(n3);
            n--;
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}

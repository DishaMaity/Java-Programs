import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1 = in.nextInt();
        System.out.println("Enter second number : ");
        int n2 = in.nextInt();
        System.out.println( sum(n1,n2));

    }
    static int sum (int n1, int n2) {
        return n1+n2;
    }
}

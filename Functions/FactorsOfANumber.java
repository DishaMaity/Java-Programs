import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value : ");
        int n = in.nextInt();
        factor(n);
    }
    static void factor(int n) {
        for (int i = 1; i<=n; i++) {
            if (n%i == 0) {
                System.out.println(i);
            }
        }
    }
}

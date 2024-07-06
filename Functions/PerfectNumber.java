import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int n = in.nextInt();
        System.out.println(perfectNumber(n));
    }
    static String perfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i<n; i++) {
            if (n%i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return "Perfect Number";
        }
        else {
            return "Not a Perfect Number";
        }
    }
}

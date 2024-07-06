import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Age : ");
        int n = in.nextInt();
        System.out.println(age(n));

    }
    static String age(int n) {
        if (n >= 18) {
            return "Eligible";
        }
        else {
            return "Not eligible";
        }
    }
}

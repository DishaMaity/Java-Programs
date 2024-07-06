import java.util.Scanner;

public class nCr_nPr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value for r : ");
        int r = in.nextInt();
        System.out.print("Enter the value for n : ");
        int n = in.nextInt();
        System.out.println("Permutation = " + permutation(n,r));
        System.out.println("Combination = " + conbination(n,r));
    }
    static double permutation(double n, double r) {
        int a = 1;      // for n!
        int b = 1;      // for (n-r)!
        for(int i=1; i<=n; i++) {
            a *= i;
        }
        for(int i=1; i<=(n-r); i++) {
            b *= i;
        }
        return a/b;
    }
    public static double conbination(double n, double r) {
        int c = 1;      // for r!
        for(int i=1; i<=r; i++) {
            c *= i;
        }
        return permutation(n,r)/c;
    }

}

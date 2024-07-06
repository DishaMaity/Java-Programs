import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principal : ");
        int p = in.nextInt();
        System.out.print("Enter rate : ");
        int r = in.nextInt();
        System.out.print("Enter time : ");
        int t = in.nextInt();

        System.out.println("Compound Interest = " + compoundInterest(p,r,t));
    }
    static double compoundInterest(double p, double r, double t) {
        double a = r/100;
        double b = 1+a;
        double c = Math.pow(b,t);
        double d = p*c;
        return d-p;
    }
}

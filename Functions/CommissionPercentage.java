import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter purchase price : ");
        double p = in.nextDouble();
        System.out.print("Enter commission value : ");
        double c = in.nextDouble();

        System.out.println("Commission Percentage = " + percentage(p,c));
    }

    static double percentage(double p, double c) {
        return (c/p)*100;
    }
}

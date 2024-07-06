import java.util.Scanner;

public class DiscountOnProducts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Price of the product : ");
        int p = in.nextInt();
        System.out.println("Enter Discount percentage : ");
        int d = in.nextInt();

        System.out.println("Price with discount = " + discount(p,d));
    }

    static double discount(double p, double d) {
        double dp = (d*p)/100;
        return (p-dp);
    }
}

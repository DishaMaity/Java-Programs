import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Method : ");
        String method = in.nextLine();

        System.out.print("Enter Asset Cost : ");
        double as = in.nextDouble();
        switch (method) {
            case "Straight Line" -> {
                System.out.println("Residual Value : ");
                double rv = in.nextDouble();
                System.out.println("Useful Life of Assets : ");
                double la = in.nextDouble();
                System.out.println("Depreciation value = "+ straight_line(as,rv,la));
            }
            case "Unit of Production" -> {
                System.out.println("Residual Value : ");
                double rv = in.nextDouble();
                System.out.println("Life Time Production : ");
                double lt = in.nextDouble();
                System.out.println("Units Produced : ");
                double up = in.nextDouble();
                System.out.println("Depreciation value = "+ unit_of_production(as,rv,lt,up));
            }
            case "Double Declining Balance" -> {
                System.out.println("Accumulated Depression : ");
                double ad = in.nextDouble();
                System.out.println("Useful Life of Assets : ");
                double la = in.nextDouble();
                System.out.println("Depreciation value = "+ double_declining_balance(as,ad,la));
            }
            default -> {
                System.out.println("Invalid");
            }
        }
    }

    static double straight_line(double as, double rv, double la) {
        return (as-rv)/la;
    }
    static double unit_of_production(double as, double rv, double lt, double up) {
        return ((as-rv)/lt)*up;
    }
    static double double_declining_balance(double as, double ad, double la) {
        return 2*((as-ad)/la);
    }
}

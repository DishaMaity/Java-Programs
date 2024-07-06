import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter electricity consumed per (kWh) : ");
        double ec = in.nextDouble();
        System.out.print("Enter Tariff rate per unit : ");
        double tr = in.nextDouble();
        System.out.println("Electricity Bill = " + cost(ec,tr) );
    }

    static double cost(double ec, double tr) {
        return ec * tr;
    }
}

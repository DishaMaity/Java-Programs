import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the coordinates of first point : ");
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        System.out.print("Enter the coordinates of second point : ");
        double m1 = in.nextDouble();
        double m2 = in.nextDouble();

        System.out.println("Distance = "+ distance(n1, n2, m1, m2) );
    }
    static double distance(double n1, double n2, double m1, double m2) {
        double a = (m1-n1);
        double b = (m2-n2);
        double c = ((Math.pow(a,2)) + (Math.pow(b,2)));
        double d = Math.pow(c,0.5);
        return d;
    }
}

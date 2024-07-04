import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }

    static double circle(double r) {
        return 2*(22/7)*r;
    }
    static double equilateralTriangle (double s) {
        return 3*s;
    }
    static double parallelogram (double l, double b) {
        return 2*(l+b);
    }
    static double rectangle (double l, double b) {
        return 2*(l+b);
    }
    static double square (double s) {
        return 4*s;
    }
    static double rhombus (double s) {
        return 4*s;
    }
}

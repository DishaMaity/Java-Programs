import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Shape : ");
        String shape = in.next();
        switch (shape){
            case "circle" -> {
                System.out.println("Enter radius : ");
                int r = in.nextInt();
                System.out.println(circle(r));
                break;
            }
            default -> {
                System.out.println("invalid input");
            }
        }
    }

    static double circle (double r) {
        return (22/7)*r*r;
    }
    static double triangle (double h, double b) {
        return 0.5 * h * b;
    }
    static double rectangle(double l, double b) {
        return l * b;
    }
    static double isoscelesTriangle (double h, double b) {
        return (0.5)*b*h;
    }
    static double parallelogram (double h, double b) {
        return h * b;
    }
    static double rhombus (double s) {
        return s*s;
    }
    static double equilateralTriangle (double h, double b) {
        return 0.5 * h * b;
    }
    static double curvedSurfaceOfCylinder (double r, double h) {
        return (2*(22/7)*r) * h;
    }
    static double surfaceOfCube (double s) {
        return (s*s)*6;
    }
}

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }

    static double cone(double h, double r) {
        return ((((22/7)*r*r)*h)/2);
    }
    static double prism (double s, double h){
        return   (Math.pow(((s*s)-(s/0.5)),0.5)*s)*h;
    }
    static double cylinder (double r, double h) {
        return ((22/7)*r*r)*h;
    }
    static double sphere (double r) {
        return (4/3)*(22/7)*r*r*r;
    }
    static double pyramid(double l, double w, double h) {
        return (l*w*h)/3;
    }
}

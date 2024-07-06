import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the height : ");
        int a = in.nextInt();
        System.out.print("Enter the base : ");
        int b = in.nextInt();
        System.out.print("Enter the hypotenuse : ");
        int c = in.nextInt();
        System.out.println(pythagorean(a,b,c));
    }

    static String pythagorean(int a, int b, int c) {
        if((a*a)+(b*b)==(c*c)) {
            return "Pythagorean";
        }else{
            return "Not a Pythagorean";
        }

    }
}

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two Numbers : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println("Enter an Operator (+,-,*,/) : ");
        String op = String.valueOf(in.next().charAt(0));

        if (op.equals("+")) {
            System.out.println("sum = "+ (n1 + n2));
        }
        else if (op.equals("-")) {
            System.out.println("difference = "+ (n1-n2));
        }
        else if (op.equals("*")) {
            System.out.println("product = "+ (n1*n2));
        }
        else if (op.equals("/")) {
            System.out.println("quotient = "+ (n1/n2));
        }
        else {
            System.out.println("Wrong Operator");
        }
    }
}

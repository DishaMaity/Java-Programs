import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int f = 1;
        while (n>0){
            f = f * n;
            n -= 1;
        }
        System.out.println("the factorial is "+ f);

    }
}

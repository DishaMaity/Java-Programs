import java.util.Scanner;

public class PowerOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = in.nextInt();
        int c = n;
        System.out.print("Enter the exponent: ");
        int e = in.nextInt();
//        while(e>=2){
//            n *= c;
//            e -= 1;
//        }
        n= (int)Math.pow(n,e);
        System.out.println("power of the number is "+ n);
    }
}

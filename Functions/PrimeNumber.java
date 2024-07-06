import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }
    static String isPrime(int n) {
        int count = 0;
        for (int i=1; i<n; i++) {
            if(n%i == 0){
                count++;
            }
        }
        if (count == 1) {
            return "Prine";
        }
        else {
            return "Not Prime";
        }
    }
}

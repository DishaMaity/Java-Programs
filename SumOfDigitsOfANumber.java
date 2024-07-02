import java.util.Scanner;
public class SumOfDigitsOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int sum =0;
        while(n!=0){
            int a= n % 10;
            sum +=a ;
            n/=10;
        }
        System.out.println("Sum of the digits: "+sum);

    }
}

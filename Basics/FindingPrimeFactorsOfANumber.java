import java.util.Scanner;

public class FindingPrimeFactorsOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
        }
        System.out.println(n);
    }

}

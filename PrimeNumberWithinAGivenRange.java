import java.util.Scanner;

public class PrimeNumberWithinAGivenRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first range Number: ");
        int n1 = in.nextInt();
        System.out.print("Enter the second range Number: ");
        int n2 = in.nextInt();

        for(int i=n1; i<=n2;i++){
            boolean a = PrimeNumber(i);
            if(a==true){
                System.out.println(i);
            }
        }
    }
    static boolean PrimeNumber(int num){
        if(num<2)
            return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
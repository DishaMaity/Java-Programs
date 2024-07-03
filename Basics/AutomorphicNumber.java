import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int temp = n;
        int sq = n*n;
        System.out.println(sq);
        int count = 0;
        int rem =0;
        while(n!=0) {
            rem = n % 10;
            count++;
            n/=10;
        }
        int power = (int)Math.pow(10,count);
        int l = sq%power;
        System.out.println(temp);
        System.out.println(l);
        if (temp==l){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not an automorphic number");
        }
    }
}

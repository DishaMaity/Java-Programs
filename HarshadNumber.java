import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int temp =n;
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum += rem;
            n /= 10;
        }
        if(temp%sum==0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not a harshad number");
        }

    }
}

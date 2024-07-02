import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int temp = n;
        int sum = 0;
        for(int i=1;i<n;i++){
            if (n%i ==0){
                sum = sum + i;
            }
        }
        if(temp==sum){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }

    }
}

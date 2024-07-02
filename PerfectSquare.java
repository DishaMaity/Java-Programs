import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        double sq = (double)Math.sqrt(n);
        int i =0;
        for(i=1;i<=n/2;i++){
            if(i==sq){
                System.out.println("Perfect Number");
                break;
            }
        }
        if(i!=sq){
            System.out.println("Not a perfect number");
        }

    }
}

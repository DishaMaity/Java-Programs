import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int temp = n;
        int rem = 0;
        int sum = 0;
        while(n!=0){
            rem = n%10;
            int f = 1;
            int fact = 1;
            for(int i=1;i<=rem;i++){
                fact =fact*i;
            }
            sum+=fact;
            n = n/10;
        }
        if (temp==sum){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a strong number");
        }



    }


}


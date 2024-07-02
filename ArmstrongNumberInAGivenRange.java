import java.util.Scanner;

public class ArmstrongNumberInAGivenRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first range: ");
        int n1 = in.nextInt();
        System.out.println("Enter the second range");
        int n2 = in.nextInt();

        for (int i=n1;i<=n2;i++) {
            ArmStrongNumberInAGivenRange(i);
        }

    }
    static int ArmStrongNumberInAGivenRange(int n){
        int on= n;
        int sum = 0;
        int temp =n;
        int count =0;
        int rem =0;
        while(n!=0){
            rem = n%10;
            count++;
            n=n/10;
        }
        rem=0;
        while(temp!=0){
            rem = temp%10;
            sum +=(Math.pow(rem,count));
            temp = temp/10;
        }
        if(sum==on) {
            System.out.println(on+" Armstrong");
        }
        return sum;
    }
}

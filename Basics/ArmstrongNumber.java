import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
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
        if(sum==on){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not an armstrong");
        }


    }
}

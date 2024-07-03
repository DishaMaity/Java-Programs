import java.util.Scanner;

import static java.lang.Math.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first range : ");
        int n1 = in.nextInt();
        System.out.println("Enter the second range : ");
        int n2 = in.nextInt();

        for(int i=n1; i<=n2; i++) {
            ArmstrongNumber(i);
        }

    }

    static void ArmstrongNumber(int n) {
        int or = n;
        int temp = n;
        int count = 0;
        int rem = 0;

        while (n != 0) {    // for the power value
            rem = n%10;
            count++;
            n /= 10;
        }

        int sum = 0;
        while (temp != 0) {
            rem = temp % 10;
            sum += (int) Math.pow(rem,count);
            temp /= 10;
        }

        if (or == sum) {
            System.out.println(or + " Armstrong Number");
        }


    }
}

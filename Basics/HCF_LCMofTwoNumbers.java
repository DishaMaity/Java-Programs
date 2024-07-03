import java.util.Scanner;

public class HCF_LCMofTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the first number : ");
        int n1 = in.nextInt();
        System.out.println("Enter the second number : ");
        int n2 = in.nextInt();

        int hcf = 0;
        int lcm = 0;
        int num = 0;
        if (n1 > n2) {
            num = n1;
        }
        else {
            num = n2;
        }

        for (int i=1; i <= num ; i++) {
            if (n1 % i == 0  &&  n2 % i == 0 ) {
                hcf = i;
            }
        }
        lcm = (n1 * n2) / hcf;

        System.out.println("HCF = " +hcf);
        System.out.println("LCM = " +lcm);
    }
}

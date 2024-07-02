import java.util.Scanner;

public class SumOfNumbersInAgivenRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter the first number in the range: ");
        n1 = in.nextInt();
        System.out.print("Enter the last number in the range: ");
        n2 = in.nextInt();
        int sum = 0;
        for (int i=n1;i<=n2;i++){
            sum = sum + i;
        }
        System.out.println("sum = "+sum);
    }
}

import java.util.Scanner;

public class SumOf_Negative_PositiveEven_PositiveOdd_Numbers_Separately {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        int negativeSum = 0;
        while (true) {
            System.out.print("Enter value : ");
            int n = in.nextInt();
            if(n==0){
                System.out.println("sum of even = " +sumEven);
                System.out.println("sum of odd = " +sumOdd);
                System.out.println("sum of negative = " +negativeSum);
                break;
            }
            if (n<0) {
                negativeSum += sumOfNegativeNum(n);
            }

            else {
                if (n%2 == 0) {
                    sumEven+=sumOfEvenNum(n);
                }
                else {
                    sumOdd+=sumOfOddNum(n);
                }
            }

        }
    }
    static int sumOfNegativeNum(int n) {
        int sum = 0;
        sum += n;
        return sum;
    }
    static int sumOfEvenNum(int n) {
        int sum = 0;
        sum += n;
        return sum;
    }
    static int sumOfOddNum(int n) {
        int sum = 0;
        sum += n;
        return sum;
    }
}
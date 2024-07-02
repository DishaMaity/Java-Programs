import java.util.Scanner;
public class SumOfFirstNnaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sum of N natural numbers: ");
        int n;
        n = in.nextInt();
        int sum = 0;

        for(int i =1; i<=n;i++){
            sum = sum + i;
            
        }

//        while (n>0) {
//            sum = sum + n;
//            n--;
//        }
        System.out.println("Sum is " +sum);
    }
}

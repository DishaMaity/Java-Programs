import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        if (n1 > n2) {
            System.out.println(n1 +" is the largest number");
        }else {
            System.out.println(n2 +" is the largest number");
        }
    }
}

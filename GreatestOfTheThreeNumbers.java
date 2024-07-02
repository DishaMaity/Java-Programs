import java.util.Scanner;
public class GreatestOfTheThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1,n2,n3;
        System.out.print("Enter the first number: ");
        n1 = in.nextInt();
        System.out.print("Enter the second number: ");
        n2 = in.nextInt();
        System.out.print("Enter the third number: ");
        n3 = in.nextInt();
        System.out.println("Greatest number is "+Math.max(n1,Math.max(n2,n3)));
    }
}

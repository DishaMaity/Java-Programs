import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = in.nextInt();
        int n = 1;
        while (n <= 10) {
            int p = n * a ;
            System.out.println(a +"*"+ n +"="+ p);
            n++;
        }
        System.out.println();
    }
}

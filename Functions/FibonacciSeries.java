import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int n = in.nextInt();
        fibonacci (n);

    }
//    0 1 1 2 3 5 8 13
    static void fibonacci (int n) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            if(i==1){
                System.out.println(a);
            }
            if (i==2){
                System.out.println(b);
            }
            if(i>2){
                int c = a+b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}

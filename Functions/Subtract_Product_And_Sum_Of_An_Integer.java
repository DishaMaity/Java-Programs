import java.util.Scanner;

public class Subtract_Product_And_Sum_Of_An_Integer {
    static int rem =0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        System.out.println("Product = " + subtract(n));

    }
//    int n=p
//
    static int product (int p) {
        int pro =1;
        while(p!=0){
            rem = p%10;
            p /=10;
            pro *=rem;
        }
        return pro;
    }
    static int add (int a) {
        int s = 0;
        while(a!=0) {
            int rem = a%10;
            s += rem;
            a /= 10;
        }
        return s;
    }
    static int subtract(int s) {
        int sub = product(s)-add(s);
        return sub;
    }


}

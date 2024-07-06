import java.util.Scanner;

public class Maximum_Minimum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        System.out.println("Maximum value : " + maximum(n1,n2,n3));
        System.out.println("Minimum value : " + minimum(n1,n2,n3));
    }
    static int maximum(int n1, int n2, int n3) {
        int max = 0;
        if (n1>n2 && n1>n3) {
            max = n1;
        }
        else if (n2>n1 && n2>n3) {
            max = n2;
        }
        else {
            max = n3;
        }
        return max;
    }
    static int minimum(int n1, int n2, int n3) {
        int min = 0;
        if (n1<n2 && n1<n3) {
            min = n1;
        }
        else if (n2<n1 && n2<n3) {
            min = n2;
        }
        else {
            min = n3;
        }
        return min;
    }
}

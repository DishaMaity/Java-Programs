import java.util.Scanner;
public class FibonacciSeriesUptoNTerm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth term: ");
        int l = in.nextInt();
        int n2 = 1;
        int n1 = 0;
        if(l>0){
            System.out.println(n1);
            if(l>1){
                System.out.println(n2);
            }
        }
        for (int i=3;i<=l;i++){
            int c=n1+n2;
            System.out.println(c);

            n1 = n2;
            n2 = c;
        }

    }
}

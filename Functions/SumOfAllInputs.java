import java.util.Scanner;

public class SumOfAllInputs {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    static int sum () {
        Scanner in = new Scanner(System.in);
        int s = 0;
        System.out.println("Enter value : ");

        while (true) {
            int n = in.nextInt();
            if(n==0){
                return s;
            }
            s += n;
        }
    }
}

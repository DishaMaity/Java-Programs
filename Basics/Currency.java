import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value in Rupees : ");
        double rs = in.nextInt();
        double usd = rs/83.36;
        System.out.println("value in USD = "+usd);
    }
}

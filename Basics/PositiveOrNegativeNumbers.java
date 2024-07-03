import java.util.Scanner;
public class PositiveOrNegativeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n;
        n = in.nextInt();
        if (n>=0){
            System.out.println(n+" is a positive number");
        }
        else {
            System.out.println(n + " is a negative number");

        }   }
}

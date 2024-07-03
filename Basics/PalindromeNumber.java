import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int temp = n;
        int rev =0;
        while(n!=0){
            int rem = n%10;
            rev = rev*10 +rem;
            n = n/10;
        }
        if(temp==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }

    }
}

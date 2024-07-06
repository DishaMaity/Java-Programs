import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string : ");
        String a = in.next();

        System.out.println(isPalindrome(a));
    }
    static String isPalindrome(String a) {
        for(int i=0; i<(a.length())/2; i++){
            String start = String.valueOf(a.charAt(i));
            String end = String.valueOf(a.charAt(a.length()-1-i));
            if(!(start.equals(end))){
                return"not palindrome";
            }
        }
        return "palindrome";
    }
}

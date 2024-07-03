import java.io.OptionalDataException;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String a = in.next();

        System.out.println(palindrome(a));

        
    }

    private static String palindrome(String a) {
//        malayalam
//        012345678
        int l=a.length()-1;
        for(int i =0;i<(a.length()-1)/2;i++){
            if(!(String.valueOf(a.charAt(i)).equals(String.valueOf(a.charAt(l))))){
                return "not palindrome";
            }
            l--;
        }
        return "palindrome";
    }

}

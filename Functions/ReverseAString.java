import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = in.nextLine();
        System.out.println("Reversed String = " + reverse(s));
    }
    static StringBuilder reverse(String s) {
        StringBuilder rev = new StringBuilder();
        rev.append(s);
        rev.reverse();
        return rev;

//        for (int i=0; i<s.length()/2; i++) {
//            String first = String.valueOf(s.charAt(i));
//            String last = String.valueOf(s.charAt(s.length()-1-i));
//            String temp = first;
//            first = last;
//            last = temp;
//            String a = s;
//
//        }
    }
}

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter alphabet : ");
        String s = in.next();
        System.out.println(type(s));
    }

    static String type(String s) {
        switch (s) {
            case "a.IgnoreCase(s)" -> {
                return "Vowel";
            }
            case "e" -> {
                return "Vowel";
            }
            case "i" -> {
                return "Vowel";
            }
            case "o" -> {
                return "Vowel";
            }
            case "u" -> {
                return "Vowel";
            }
            default -> {
                return "Consonant";
            }
        }

    }
}

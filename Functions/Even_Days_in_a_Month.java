import java.util.Scanner;

public class Even_Days_in_a_Month {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month : ");
        String m = in.next();
        int n = 0;
        switch (m) {
            case "jan" -> {n = 31;}
            case "feb" -> {n = 28;}
            case "mar" -> {n = 31;}
            case "apr" -> {n = 30;}
            case "may" -> {n = 31;}
            case "jun" -> {n = 30;}
            case "jul" -> {n = 31;}
            case "aug" -> {n = 31;}
            case "sep" -> {n = 30;}
            case "oct" -> {n = 31;}
            case "nov" -> {n = 30;}
            case "dec" -> {n = 31;}
            default -> System.out.println("Invalid");
        }
        System.out.println("Even days = " + evendays(n));
    }
    static int evendays(int n) {
        int count = 0;
        for (int i=1; i<=n; i++) {
            if (i%2 == 0) {
                count++;
            }
        }
        return count;
    }
}

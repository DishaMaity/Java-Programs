import java.util.Scanner;

public class AverageOfN_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(average());

    }
    static double average () {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        while (true) {
            int n = in.nextInt();
            if (n != 0){
                sum += n;
                count++;
            }
            else {
                break;
            }
        }
        return sum/count;
    }
}

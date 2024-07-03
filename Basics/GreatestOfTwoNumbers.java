import java.util.Scanner;
public class GreatestOfTwoNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1,n2;
        System.out.print("Enter the first number: ");
        n1 = in.nextInt();
        System.out.print("Enter the second number: ");
        n2 = in.nextInt();
//        if (n1>n2){
//            System.out.println(n1+" is greater than "+n2);
//        }else{
//            System.out.println(n2+" is greater than "+n1);
//        }
        System.out.println("Greatest value is "+Math.max(n1,n2));
    }
}

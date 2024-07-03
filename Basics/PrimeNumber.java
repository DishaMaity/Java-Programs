import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range first Number: ");
        int n =in.nextInt();
        boolean a = false;
        for(int i=2;i*i<=n;i++){
            if (n%i==0){
                a= true;
            }
        }
        if(a==true){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }




    }
}

import java.util.Scanner;
public class FriendlyPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1= in.nextInt();
        int n2= in.nextInt();
        int fact = 1;
        int x,y,a,b;
        x=y=0;

        for(int i=1;i<=n1;i++){
            fact*=i;
        }
        System.out.println(x);
        fact =1;
        for(int i=1;i<=n2;i++){
            fact*=i;
            y=fact;
        }
        System.out.println(y);
        a=x/n1;
        b=y/n2;
        System.out.println(a);
        if(a==b){
            System.out.println("Friendly pair");
        }else{
            System.out.println("not Friendly pair");
        }

    }
}
import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println(hcf(n1,n2));
        System.out.println(lcm(n1,n2));
    }
    static int hcf(int a, int b){
        int hcf = 0;
        int n = 0;
        if (a>b){
            n=a;
        }
        else {
            n=b;
        }
        for(int i=1; i<=n; i++) {
            if (a%i == 0 && b%i == 0 ){
                hcf =i;
            }
        }
        return hcf;
    }
    public static int lcm(int a,int b) {
        int hcf = hcf(a,b);
        return (a*b)/hcf;
    }

}

import java.util.Scanner;

public class SumOfAllNumbersUntilX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,sum =0;
        String n;
        while(true){
            n = in.next();
            try{
                if("x".equalsIgnoreCase(n)){
                    System.out.println(sum);
                    break;
                }else{
                    num = Integer.parseInt(n);
                    sum+=num;
                }
            }catch(NumberFormatException e){
                System.out.println("invalid input");
            }
        }

    }
}

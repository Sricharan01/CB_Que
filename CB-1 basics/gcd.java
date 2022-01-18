import java.util.Scanner;
public class gcd {
    public static void main(String args[]) {

        Scanner scan = new Scanner (System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int divisor =a;
        int dividend=b;

        while(divisor!=0){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        System.out.println(dividend);

    }
}
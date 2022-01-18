
import java.util.Scanner;

class lcm {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int ax = scan.nextInt();

        // Scanner bx_u = new Scanner(System.in);
        int bx = scan.nextInt();

        int divisor = ax;
        int dividend = bx;

        while(divisor!=0){
            int rem = dividend % divisor;
            dividend=divisor;
            divisor=rem;
        }
        int result = ax*bx;
        int lcm = result/dividend;
        System.out.println(lcm);
    }
}
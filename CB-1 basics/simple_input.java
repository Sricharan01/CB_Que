import java.util.*;
public class simple_input {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int sum = 0;
        while(true) {
            int i = scn.nextInt();
            sum += i;

            if(sum<0) break;
            else System.out.println(i);
        }
    }
}
import java.util.*;
public class sumof_odd_even_placed_digits {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        long N = scn.nextLong();
        boolean isodd = (N%2 == 1)? true : false;
        int i = 1;
        int oddsum = 0, evensum = 0;

        while(N != 0) {
            if(i%2 != 0) {
                oddsum += N%10;
            }
            else {
                evensum += N%10;
            }
            i++;
            N /=10;

        }
        System.out.println(oddsum);
        System.out.println(evensum);


    }
}
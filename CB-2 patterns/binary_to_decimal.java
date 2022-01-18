import java.util.*;
public class binary_to_decimal {
    public static void main(String args[])  {
		
		Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();
        int dec_value = 0;
        int base = 1;
        int temp = N;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }
        System.out.println(dec_value);
       
    }

}
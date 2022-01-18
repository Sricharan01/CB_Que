import java.util.*;
public class inverse_of_numbers {
    public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		long N = scn.nextLong();
		long place = 1, ans =0;
		while(N != 0) {
			long rem = N%10;
			ans += place*Math.pow(10, rem-1);
			N/=10;
			place++;
		}
		System.out.println(ans);
	}
}
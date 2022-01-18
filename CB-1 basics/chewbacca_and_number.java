import java.util.*;
import java.util.Scanner;

public class chewbacca_and_number {
    public static void main(String args[]) {

        Scanner num = new Scanner(System.in);

		long n = num.nextLong();

		long[] a = new long[18];

		int count = 0;

		while (n != 0) {
			long rem = n % 10;
			a[count] = rem;
			count++;
			n = n / 10;
		}
        
		for (int i = 0; i < count; i++) {

			if (i != count - 1) {
				if (a[i] >= 5) {
					a[i] = 9 - a[i];
				}
			} else {
				if (a[i] >= 5 && a[i] <= 8) {
					a[i] = 9 - a[i];
				}
			}
		}

		for (int i = count - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}

    }
}
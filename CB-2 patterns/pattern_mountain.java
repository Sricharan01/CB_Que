import java.util.*;
public class pattern_mountain {
    public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

        int rows = scn.nextInt();
	    int k = 0, count = 0, count1 = 0;

		int i=1;

	    while (i <= rows) {
		int space =1;
	      while (space <= rows - i ) {
	        System.out.print("  ");
	        ++count;

			++space;
	      }

	      while (k != 2 * i - 1) {
	        if (count <= rows - 1) {
	          System.out.print((i + k) + " ");
	          ++count;
	        } else {
	          ++count1;
	          System.out.print((i + k - 2 * count1) + " ");
	        }

	        ++k;
	      }
	      count1 = count = k = 0;

	      System.out.println();

		  ++i;
	    }
	  }
	}
import java.util.*;
import java.util.Scanner;

public class pattern_with_zeros {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=1) System.out.println(1);
        if(n>=2) System.out.println("2\t2");
        if(n>=3) {
            for (int i = 3; i <= n; i++) {
                for ( int j = 1; j <= i; j++) {
                    if ( j == 1 || j == i)
                        System.out.print(i+ "\t");
                    else
                        System.out.print(0+"\t");
                }
                System.out.println();
            }
        }
    }
}
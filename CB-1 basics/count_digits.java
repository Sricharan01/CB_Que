import java.util.*;
import java.util.Scanner;

class count_digits{
    static int freqDigi(int n, int d)
    {
        int c=0;
        while(n>0)
        {
            if(n%10==d)
            c++;
            n=n/10;
        }
        return c;
    }
    public static void main(String []args)
    {
        Scanner scan = new Scanner (System.in);
        int N = scan.nextInt();
        int D = scan.nextInt();

        System.out.println(freqDigi(N,D));
    }
}


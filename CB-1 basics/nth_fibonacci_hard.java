import java.util.*;
// import java.util.Scanner; 

public class nth_fibonacci_hard {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn =new  Scanner(System.in);
        int count = 1;
        int N =scn.nextInt();
        int a = 0;
        int b=1;
        while(count<=N){
            int c= a+b;
            a=b;
            b=c;
            count++;
        }
            System.out.println(a);

    }
}

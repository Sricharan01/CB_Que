import java.util.*;
public class fibonacci_pattern {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n;
        n=scn.nextInt();
        int row=1;
        int nst =1;
        int fst_val=0;
        int scd_val=1;
        int nxt=1;
        while(row<=n){
            int cst = 1;
            while(cst<=nst){
                if(row==1){
                    
                    System.out.print("0");

                }
                else{
                    System.out.print(nxt + "\t");
                    nxt = fst_val + scd_val;
                    fst_val = scd_val;
                    scd_val = nxt;
                }
                    
                
                cst++;
            }
            row++;
            System.out.println();
            nst++;
        }

    }
}
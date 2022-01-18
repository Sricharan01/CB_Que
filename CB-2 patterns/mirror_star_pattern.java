import java.util.*;
public class mirror_star_pattern {
public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int n= sn.nextInt(),nsp=n-1,nst=1,row=1;
    while(row<=n) {
        int csp=1;
        while(csp<=nsp) {
            System.out.print("  ");
            csp++;
        }
        int cst=1;
        while(cst<=nst){
            System.out.print("* ");
            cst++;
        }
        if(row<=n/2) {
            nst+=2;
            nsp-=2;
        }
        else {
            nsp+=2;
            nst-=2;
        }
        row++;
        System.out.println();
    }
}
}
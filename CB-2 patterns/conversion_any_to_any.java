import java.util.*;
public class conversion_any_to_any {
    public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);

        int inum = scn.nextInt();
        int fnum = scn.nextInt();
        long N = scn.nextInt();
        long res=0;
        int count=0;
        long decimal=0;
        while(N!=0) {
        	decimal += (N%10)*Math.pow(inum,count);
        	count++;
        	N/=10;        	
        }
        count = 0;
        while(decimal!=0) {
        	res += (decimal%fnum)*Math.pow(10, count);
        	count++;
        	decimal /= fnum;
        }
        System.out.println(res);
        

	}

}
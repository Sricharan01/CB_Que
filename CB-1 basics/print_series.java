import java.util.*;
public class print_series {
    public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		int N1 = scn.nextInt();
		int N2 = scn.nextInt();
		int y=1;
		int count = 1;
		
		while(count<=N1){
			int a=3*y+2;
			if(a%N2!=0){
				System.out.println(a);
				count++;				
			}
				y++;
			}
	}
}
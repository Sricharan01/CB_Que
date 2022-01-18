import java.util.Scanner;

public class basic_calculator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

        long N1, N2;

		while(true) {
			char ch = scn.next().charAt(0);
			
			if(ch == 'x' || ch == 'X') break;
			 
			
			if(ch == '*') {
				N1 = scn.nextLong();
			 N2 = scn.nextLong();
				System.out.println(N1*N2);
				
			}
			else if(ch == '+') {
                N1 = scn.nextLong();
			 N2 = scn.nextLong();
				
				System.out.println(N1+N2);
			}
			else if(ch == '-') {
                N1 = scn.nextLong();
			 N2 = scn.nextLong();
				
				System.out.println(N1-N2);
			}
			else if(ch == '%') {
                N1 = scn.nextLong();
			 N2 = scn.nextLong();
				
				System.out.println(N1%N2);
			}
			else if(ch == '/') {
                N1 = scn.nextLong();
			 N2 = scn.nextLong();
				
				System.out.println(N1/N2);
			}
			 else {
                 
				 System.out.println("Invalid operation. Try again.");
			 }
		}
	}

}
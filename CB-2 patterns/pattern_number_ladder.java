import java.util.Scanner;
  
public class pattern_number_ladder
{            
        public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();

            int i, j, k = 1;
			i=1;
            while (i <= n) {
				j=1;
                while (j< i + 1) {
                    System.out.print(k++ + " ");
					j++;
                }
       
                System.out.println();
				i++;
            }
        }
       
    }
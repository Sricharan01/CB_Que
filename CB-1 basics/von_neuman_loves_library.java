import java.util.*;
public class von_neuman_loves_library {
    public static void main(String args[])  {
            Scanner scn = new Scanner(System.in);
            
            int n = scn.nextInt();
            
            while(n>0) {
            	
            	  long N = scn.nextLong();
                  
                  long decimal=0,p=0;
                  
                  while(N!=0)
                  {
                      decimal+=((N%10)*Math.pow(2,p));
                      N=N/10;
                      p++;
                  }
                  
                  System.out.println(decimal);
                  n--;
              }
            	
            }    
}
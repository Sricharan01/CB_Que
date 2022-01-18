import java.util.Scanner;
public class odd_even_back_in_delhi {

	public static void main(String[] args){  
		
		Scanner scn = new Scanner(System.in); 
	    int N, digit, sum = 0;
	   
	    int n;
	    
	    n = scn.nextInt(); 
	    while(n>0) {
	    	
	    int evensum = 0, oddsum = 0;
	 //   System.out.print("Enter the number: ");  
	    N = scn.nextInt();  
	   
	    while(N > 0)  
	    {  
	        digit = N % 10;  
	        if(digit % 2 == 0) {
	        	evensum += digit;
	        }
	        else {
	        	oddsum += digit;
	        }
	  	        N = N / 10;       
	}  
	    
	   	if(evensum%4==0 || oddsum%3==0){
	    System.out.println("Yes");
	        }
	        else{
	    System.out.println("No");
	        }
	   	n--;
	    }
	}
	}
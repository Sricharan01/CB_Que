import java.util.Scanner;
public class boston_numbers {
    // static boolean isprime(int n)
    // {
    //     if(n%2==0)
    //     return false;
    //     else if(n==2)
    //     return true;
    //     else if(n%2==0)
    //     return false;
    //     int i = 3;
    //     double root = Math.floor(Math.sqrt(n))+1;
    //     while(i<root)
    //     {
    //         if(n%i==0)
    //         return false;
    //         i+=2;
    //     }
    //     return true;
    // }
    // there will be no use if you uncomment the above part of code
    static long sumofdigits(long n)
    {
        long sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int temp=n;
        int i = 2;
        while(temp != 1){
            if(temp%i==0){
                sum+=sumofdigits(i);
                temp/=i;
            }else{
                i += 1;
            }
        }
        
        System.out.println(sumofdigits(n)==sum?1:0);
    }
}

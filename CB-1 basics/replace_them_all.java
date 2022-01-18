import java.util.*;
import java.util.Scanner;

class replace_them_all{

    static long reverse(long temp){
        long ans = 0;
        while (temp>0){
            long rem = temp%10;
            ans=ans*10+rem;
            temp=temp/10;
        }
        return ans;
    }
    static long convert(long num){
        if (num==0)
        return 5;

        else{
            long temp = 0;

            while(num>0){
                long digit = num%10;

                if(digit==0)
                    digit=5;

                temp=temp*10+digit;
                num=num/10;
            }
            return reverse(temp);
        }
    }

    public static void main(String[]args){
        // int num=102;
        Scanner num_u = new Scanner(System.in);
        long num = num_u.nextLong();
        System.out.println(convert(num));
    }
}
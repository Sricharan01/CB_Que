import java.util.Scanner;
public class shopping_game {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t>0)
        {
            long m = scan.nextLong();
            long n = scan.nextLong();
            long Aayush=0,Harshit=0;
            int i=1;
            while(Aayush<=m&&Harshit<=n)
            {
                if(i%2==1)
                Aayush+=i;
                else
                Harshit+=i;
                i++;
            }
            String name = Aayush>m?"Harshit":"Aayush";
            System.out.println(name);
            t--;
        }
    }
}
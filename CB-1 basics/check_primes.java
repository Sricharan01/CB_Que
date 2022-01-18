import java.util.*;
class check_primes {
    public static void main(String args[]) {
        // System.out.println("Enter value: ")
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i=2, count= 0;
        while (i<=number/2)
        {
            if (number%i==0)
            {
                count++;
                break;
            }
            i++;
        }
        if (count==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

    }
}
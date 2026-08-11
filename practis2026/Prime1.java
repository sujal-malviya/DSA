import java.util.Scanner;

public class Prime1 {

    public static boolean isPrime(int n)
    {
        int count =0;
        if(n==1)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==0)
        {
            return  true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(isPrime(n))
        {
            System.out.println(n+" is prime number");
        }
        else
        {
            System.out.println(n+" is not prime number");
        }
    }
    
}

import java.util.Scanner;

class Prime
{
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
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
}
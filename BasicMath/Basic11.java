package BasicMath;

import java.util.Scanner;
import javax.xml.transform.SourceLocator;
import org.w3c.dom.ranges.RangeException;

public class Basic11 {
    static void rangeofPrimeNumber(int n)
    {
        for(int i =1;i<n;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i+" is prime");
            }
            else
            {
                System.out.println(i+" is not prime");
            }
        }
    }
    static boolean  isPrime(int num) {
        
        if(num<=1)
        {
            return false;
        }
        
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        rangeofPrimeNumber(n);
    }
}

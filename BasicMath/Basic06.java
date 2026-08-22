package BasicMath;

import java.util.*;
import java.util.Scanner;

public class Basic06 {
    static boolean isPrime(int n)
    {
        if(n==1)
        {
            return false;
        }
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean result = isPrime(n);
        System.out.println(n+" is prime : "+result);
    } 
}

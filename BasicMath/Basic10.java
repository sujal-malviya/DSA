package BasicMath;

import java.util.Scanner;

public class Basic10 {
    static boolean isPerfectNumber(int num)
    {
        int i=1;
        int sum =0;
        int temp = num;
        while(i<num)
        {
            if(num%i==0)
            {
                sum += i;
            }
            i++;
        }
        if(sum==temp)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean result = isPerfectNumber(num);
        System.out.println(num+" is perfect number : "+result);
    }
    
}

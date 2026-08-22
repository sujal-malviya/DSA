package BasicMath;

import java.util.Scanner;

public class Basic09 {
    static boolean  isArmstrongNum(int num)
    {
        String count = String.valueOf(num) ;
        int length = count.length();
        int temp =num;
        int result = 0;
        int temp2 = num;
        while(temp!=0)
        {
            int digit = temp%10;
            result = result + (int)Math.pow(digit,length);
            temp = temp/10;
        }
        if(result == temp2 )
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        boolean result = isArmstrongNum(num1);
        System.out.println(num1+" : is Armstrong Number : "+result);
    }
    
}

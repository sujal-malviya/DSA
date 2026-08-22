package BasicMath;

import java.util.Scanner;

public class Basic08 {
    static int gcd(int num1,int num2)
    {
        while(num2!=0)
        {
            int oldvalueofnum2 = num2;
            num2 = num1%num2;
            num1 = oldvalueofnum2;
        }
        int ans = num1;
        return ans;
    }
    static int Lcm(int num1 ,int num2)
    {
        //LCM(num1,num2 ) = (num1*num2)/(HCF(num1,nums2)
        int result = (num1*num2)/gcd(num1,num2);
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int result = Lcm(num1, num2);
        System.out.println("LCM of "+num1+" and "+num2+" is "+result);
    }
}

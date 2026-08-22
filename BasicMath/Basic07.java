package BasicMath;
import java.util.Scanner;
class Basic07
{
    static int gcd(int num1 , int num2)
    {
        // gdc(a,b) = gcd(b,a%b)
        while(num2!=0)
        {
            int oldvalueofnum2 = num2;
            num2 = num1%num2;
            num1 = oldvalueofnum2;

        }
        int ans = num1;
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int result = gcd(num1,num2);
        System.out.println("GCD of "+num1+" and "+num2+" is "+result);
    }
}
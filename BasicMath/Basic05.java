package BasicMath;

public class Basic05 {
    static boolean isPallindrome(int number)
    {
        if(number==0)
        {
            return false;
        }
        int temp = number;
        int reverse =0;
        while(number!=0)
        {
            int digit= number%10;
            reverse = reverse*10+digit;
            number = number/10;

        }
        return temp == reverse;
    }
    public static void main(String[] args) {
        boolean result = isPallindrome(121);
        System.out.println("Pallindrome Number : "+result);
    }
}

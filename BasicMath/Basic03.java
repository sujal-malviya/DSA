package BasicMath;

public class Basic03 {
    static void SumofDigit(long num)
    {
        int sum =0;
        while(num!=0)
        {
            long mod = num%10;
            sum += mod;
            num = num/10;
        }
        System.out.println("Sum of Digit is : "+sum);
    }
    public static void main(String[] args) {
        long num =12345;
        SumofDigit(num);

    }
    
}

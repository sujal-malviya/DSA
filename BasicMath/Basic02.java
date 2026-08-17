package BasicMath;

public class Basic02 {
    static void CountDigits(long num)
    {
        int count =0;
        while(num!=0)
        {
            long mod = num%10;
            count++;
            num = num/10;
        }
        System.out.println("count of Digit is : "+count);
    }
    public static void main(String[] args) {
        long num =12345;
        CountDigits(num);

    }
}

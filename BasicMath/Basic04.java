package BasicMath;

public class Basic04 {
    static long ReverseNum(long num)
    {
        long revers =0;
        while(num!=0)
        {
            long digit = num%10;
            revers = revers*10 + digit;
            num = num/10;
        }
        return revers;
    }
    public static void main(String[] args) {
        long num = 54321;
        long result = ReverseNum(num);
        System.out.println("Reverse is : "+result);
    }
    
}

package BasicMath;

public class Basic01 {
    static  void PrintDigit(long num)
    {
        
        while(num!=0)
        {
            long mod = num%10;
            System.out.println("Digit : "+mod);
            num = num/10;
        }
    }
    public static void main(String[] args) {
        long num =12345;
        PrintDigit(num);

    }
    
}

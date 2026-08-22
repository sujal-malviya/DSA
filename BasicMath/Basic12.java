package BasicMath;

import java.util.Scanner;

public class Basic12 {
    static int powerofn(int n,int power)
    {
        int i=0;
        int result = 1;
        while(i<power)
        {
            result = result * n;
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int power = in.nextInt();
        int result = powerofn(n, power);
        System.out.println(n+ " power "+power+" is : "+result);
    }
    
}

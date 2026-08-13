package Methods;

import java.util.Scanner;

public class Method5 {
    static boolean  isEven(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean Ans = isEven(num);
        System.out.println(Ans);
    }
    
}

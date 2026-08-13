package Methods;

import java.util.Scanner;

public class Method6 {
    static int GetMax(int a , int b)
    {
        if(a>b)
        {
            System.out.println(a+" is Greater than "+b);
            return a;
        }
        else if(a==b)
        {
            System.out.println("both are equal");
            return 0;
        }
        else{
            System.out.println(b+" is Greater than "+a);
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int result = GetMax(a, b);
        System.out.println(result);
    }
    
}

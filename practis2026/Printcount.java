import java.util.Scanner;

public class Printcount {
    static int CountNumber(int n)
    {
        int count =0;
        for(int i =1;i<=n;i++)
        {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = CountNumber(n);
        System.out.println("Count is "+result);   
    }
    
}

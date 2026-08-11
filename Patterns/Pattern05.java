package Patterns;

import java.util.Scanner;

/*  
1
22
333
4444
55555
 */
public class Pattern05 {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(i+"");
            }
            System.out.println();
        }
    }
}

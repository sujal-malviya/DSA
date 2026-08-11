package Patterns;

import java.util.Scanner;
/*
54321
5432
543
54
5
 */
public class Pattern07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
}

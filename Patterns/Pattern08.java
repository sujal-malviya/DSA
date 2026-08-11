package Patterns;

import java.util.Scanner;

public class Pattern08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for(int i =0;i<n;i++)
        {
            //space
            for(int j=0;j<n-i+1;j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-i+1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

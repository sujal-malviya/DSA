package TwoDArrays;

import java.util.Scanner;

public class TwoD10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int [4][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Printing diagonal");
        for(int i=0;i<arr.length;i++)
        {
            for(int j =0;j<arr[i].length;j++)
            {
                if(i==j || (i%2==0 && j%2==0) )
                {
                    System.out.println(arr[i][j]+" ");
                }
            }
        }

    }
    
}

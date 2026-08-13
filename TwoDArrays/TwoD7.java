package TwoDArrays;

import java.util.Scanner;

public class TwoD7 {
    static int GetMinimum(int arr[][])
    {
        int rowlength=arr.length;
        int minimum = Integer.MAX_VALUE;
        for(int i =0;i<rowlength;i++)
        {
            int collength = arr[i].length;
            for(int j=0;j<collength;j++)
            {
                if(arr[i][j]<minimum)
                {
                    minimum = arr[i][j];
                }
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[4][3];
        for(int i=0;i<arr.length;i++)
        {
            int collength = arr[i].length;
            for(int j=0;j<collength;j++)
            {
                System.out.println("Providing value for row "+i+" and column "+j+" = " );
                arr[i][j]=in.nextInt();
            }
        }
        int result = GetMinimum(arr);
        System.out.println(result);
    }
    
}

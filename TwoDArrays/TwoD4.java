package TwoDArrays;

import java.util.Scanner;

public class TwoD4 {
    static int SumOf2DArray(int arr[][])
    {
        int rowlength=arr.length;
        int sum=0;
        for(int i =0;i<rowlength;i++)
        {
            int collength = arr[i].length;
            for(int j=0;j<collength;j++)
            {
                sum += arr[i][j];
            }
        }
        return sum;
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
        int result = SumOf2DArray(arr);
        System.out.println(result);
    }
    
}

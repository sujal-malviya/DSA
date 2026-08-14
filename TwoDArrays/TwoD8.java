package TwoDArrays;

import java.util.Scanner;

public class TwoD8 {
    static void RowWiseSum(int arr[][])
    {
        int rowlength = arr.length;
        for(int i=0;i<rowlength;i++)
        {
            int sum =0;
            int collength=arr[i].length;
            for(int j=0;j<collength;j++)
            {
                sum += arr[i][j];
            }
            System.out.println("Sum of "+i+" is "+sum);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr [][] = new int [4][3];
        for(int i=0;i<arr.length;i++)
        {
            int collength =arr[i].length;
            for(int j =0;j<collength;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        RowWiseSum(arr);
    }
}

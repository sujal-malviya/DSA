package TwoDArrays;

import java.util.Scanner;

public class TwoD9 {
    static void ColumnWise(int arr[][])
    {
        int maxColumns = 0;

        for (int i = 0; i < arr.length; i++) {
            maxColumns = Math.max(maxColumns, arr[i].length);
        }
        for (int j = 0; j < maxColumns; j++) {
            int sum = 0;
            for(int k = 0; k < arr.length; k++) {
            if (j < arr[k].length) {
                sum += arr[k][j];
            }
        }
        System.out.println("sum is " + sum);
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
        ColumnWise(arr);
    }
    
}

package TwoDArrays;

import java.util.Scanner;

public class TwoD5 {
    static int Productof2DArray(int arr[][])
    {
        int rowlength=arr.length;
        int product=1;
        for(int i =0;i<rowlength;i++)
        {
            int collength = arr[i].length;
            for(int j=0;j<collength;j++)
            {
                product *= arr[i][j];
            }
        }
        return product;
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
        int result = Productof2DArray(arr);
        System.out.println(result);
    }
}

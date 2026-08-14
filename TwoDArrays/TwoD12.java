package TwoDArrays;

import java.util.Scanner;

public class TwoD12 {
    static boolean findTarget(int arr[][],int target)
    {
        int rowlength = arr.length;
        for(int i=0;i<rowlength;i++)
        {
            for(int j = 0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
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
        int target =in.nextInt();
        boolean result = findTarget(arr, target);
        System.out.println("Target : "+result);
    }
    
}

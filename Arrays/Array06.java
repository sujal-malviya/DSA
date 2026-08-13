package Arrays;

import java.util.Scanner;

public class Array06 {
    static int GetMinValue(int arr[])
    {
        int n = arr.length;
        int minimum = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<minimum)
            {
                minimum = arr[i];
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int result = GetMinValue(arr);
        System.out.println("Minimum from array is "+result);
    }
    
}

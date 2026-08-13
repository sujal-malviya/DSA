package Arrays;

import java.util.Scanner;

public class Array05 {
    static int GetMaximum(int arr[])
    {
        int n= arr.length;
        int maximum = Integer.MIN_VALUE;
        for(int i =0;i<n;i++)
        {
            if(arr[i]>maximum)
            {
                maximum = arr[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=in.nextInt();

        }
        int result = GetMaximum(arr);
        System.out.println("Maximum is "+result);
    }
    
}

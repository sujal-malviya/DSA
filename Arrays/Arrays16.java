package Arrays;

import java.util.Scanner;

public class Arrays16 {
    static boolean LinearSearch(int arr[],int target)
    {
        boolean ispresent = false;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                ispresent = true;
                return ispresent;
            }
        }
        return ispresent;
    }

     public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int target = in.nextInt();
        boolean result = LinearSearch(arr,target);
        System.out.print("target Present : "+result);
    }
}

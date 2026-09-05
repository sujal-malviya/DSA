package Arrays;
import java.util.Scanner;
public class Arrays23 {
    // static boolean isArraySortedASC(int arr[])
    // {
    //     boolean issort = true;
    //    for(int i = 0;i<arr.length;i++)
    //    {
    //     for(int j =i+1;j<arr.length;j++)
    //     {
    //         if(arr[j]<arr[i])
    //         {
    //             issort = false;
    //             return false;
    //         }
    //     }
    //    }
    //    return issort;
    // }
    static boolean isArraySortedASC(int arr[])
    {
        
        for(int i = 0 ;i<arr.length-1;i++)
        {
            if(arr[i]>=arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        boolean isArraysort = isArraySortedASC(arr);
        System.out.print("Array Sorted : "+isArraysort);
    }
    
}

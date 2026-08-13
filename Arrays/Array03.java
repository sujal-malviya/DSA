package Arrays;

import java.util.Scanner;

public class Array03 {
    static int sumofArray(int arr[])
    {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int [n];
        for(int i =0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int result = sumofArray(arr);
        System.out.println("sum of array is "+result);
    }
    
}

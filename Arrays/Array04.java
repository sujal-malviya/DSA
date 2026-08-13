package Arrays;

import java.util.Scanner;

public class Array04 {
    static int multiplicationOfArray(int arr[])
    {
        int n=arr.length;
        int ans = 1;
        for(int i =0;i<n;i++)
        {
            ans *= arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int [n];
        for(int i =0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int result = multiplicationOfArray(arr);
        System.out.println("Product is "+result);
    }
    
}

package Arrays;

import java.util.Scanner;

public class Array009 {
    static void reverseFromPosition(int arr[])
    {
        int rowlength = arr.length;
        // Two Pointer Approach.
        int start =0;
        int end=rowlength-1;
        for(int i=0;i<rowlength;i++)
        {
            if(start<end)
            {
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<rowlength;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        reverseFromPosition(arr);
    }
    
}

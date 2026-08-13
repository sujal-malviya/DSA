package Arrays;

import java.util.Scanner;

public class Array08 {
    static  int LinearSearch(int arr[],int target)
    {
        int rowlength = arr.length;
        for(int i =0;i<rowlength;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();

        }
        int target = in.nextInt();
        int result = LinearSearch(arr,target );
        System.out.println("Index = "+result);
    }
    
}

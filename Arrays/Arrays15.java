package Arrays;

import java.util.Scanner;

public class Arrays15 {
    static int secondsmallest(int []arr)
    {
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                secondsmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]!= secondsmallest && arr[i]<secondsmallest)
            {
                secondsmallest = arr[i];
            }
        }
        return secondsmallest;
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
        int result = secondsmallest(arr);
        System.out.print("Second smallest : "+result);
    }
}

package Arrays;

import java.util.Scanner;

public class Arrays14 {
    static int secondLargest(int []arr)
    {
        int largest = Integer.MIN_VALUE;
        int secondlargest = -999;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]!= secondlargest && arr[i]>secondlargest)
            {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
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
        int result = secondLargest(arr);
        System.out.print("Second Largest : "+result);
    }
}

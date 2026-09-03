package Arrays;

import java.util.Scanner;

public class Arrays12 {
    static int countPositive(int []arr)
    {
        int count = 0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int count = countPositive(arr);
        System.out.println("No. of Positive numbers are : "+count);
    }
    
}

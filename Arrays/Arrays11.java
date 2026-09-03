package Arrays;

import java.util.Scanner;

public class Arrays11 {
    static int findLargest(int arr[])
    {
        int minimum = Integer.MAX_VALUE;
        int lenght = arr.length;
        for(int i = 0;i<lenght;i++)
        {
            if(arr[i]<minimum)
            {
                minimum = arr[i];
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int result =  findLargest(arr);
        System.out.print("result : "+result);
    }
}

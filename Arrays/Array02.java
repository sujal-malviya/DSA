package Arrays;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        // taking Input of array;
        for(int i =0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        //printing value inside the array.
        System.out.println("I am normal for Loop");
        for(int i =0;i<n;i++)
        {
            System.out.println("Value at index "+i+" is "+arr[i]);
        }
        System.out.println("I am enhanced for Loop");
        for(int val:arr)
        {
            System.out.println(val);
        }
    }
    
}

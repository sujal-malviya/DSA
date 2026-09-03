package Arrays;
import java.util.Scanner;
public class Arrays17 {
    static void reverseArray(int arr[])
    {
        int i = 0;
        int j = arr.length-1;
        while(i<=j)
        {
            int temp ;
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k =0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
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
        reverseArray(arr);
    }
}

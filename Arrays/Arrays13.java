package Arrays;
import java.util.Scanner;
public class Arrays13 {
    static int sumofArray(int []arr)
    {
        int sum = 0;
        for(int i =0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String []args)
    {
       
         Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int sum = sumofArray(arr);
        System.out.print("Sum of Array is  : "+sum );
    }
}

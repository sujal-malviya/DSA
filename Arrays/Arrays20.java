package Arrays;
import java.util.Scanner;
public class Arrays20 {
    static int[] removeDuplicateFromSortedArr(int arr[])
    {
        int length = arr.length;
        for(int i =0;i<length;i++)
        {
            for(int j =i+1;j<length;j++)
            {
                if(arr[i]!=arr[j])
                {
                    arr[j-1]=arr[j];
                }
            }
        }
        int newarr[] = new int[length];
        for(int i=0;i<length;i++)
        {
            newarr[i]=arr[i];
        }
        return newarr;
    }    
    static int[] removeDuplicate(int arr[])
    {
        int lenght = arr.length;
        int i =0;
        int j=i+1;
        while(i<lenght && j<lenght)
        {
            if(arr[i]==arr[j])
            {
                j++;
               
            }
            else if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
            
        }
        int newarr[] = new int[lenght];
        for(int k =0;k<lenght;k++)
        {
            newarr[k]=arr[k];
        }
        return newarr;
    }

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int newarr[] = removeDuplicate(arr);
        for(int ch:newarr)
        {
            System.out.print(ch+" ");
        }
    }
}

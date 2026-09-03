package Arrays;
import java.util.Scanner;
public class Arrays21 {
    static int[] moveZeroesToEnd(int arr[])
    {
        int lenght = arr.length;
        for(int i =0;i<lenght;i++)
        {
            for(int j=i+1;j<lenght;j++)
            {
                int temp=0;
                if(arr[i]==0 && arr[j]!=0)
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int newarr[] = new int[lenght];
        for(int i =0;i<lenght;i++)
        {
            newarr[i]=arr[i];
        }
        return newarr;
    }   
    static int[] moveZeroToEnd(int arr[])
    {
        int lenght = arr.length;
        for(int i =0;i<lenght;i++)
        {
            
        }

    }
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]= new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]= in.nextInt();
        }
        int newarr[] = moveZeroToEnd(arr);

        for(int ch:newarr)
        {
            System.out.print(ch+" ");
        }
    }
}

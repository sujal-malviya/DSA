package Arrays;

import java.util.Scanner;

public class Arrays22 {
    static int maxSumofThreeConsecutoveEle(int arr[])
    {
        int lenght = arr.length;
        int sum = Integer.MIN_VALUE;
        if(lenght>=3)
        {
            for(int i = 0;i<lenght;i++)
            {
                for(int j=i+1;j<=i+1;j++)
                {
                    if(j<lenght)
                    {
                        for(int k =j+1;k<=j+1;k++)
                        {
                            if(k<lenght)
                            {
                                if(arr[i]+arr[j]+arr[k]>sum)
                                {
                                    sum = arr[i]+arr[j]+arr[k];
                                }   
                            }
                        
                        }
                    }
                    
                }
            }
            
        }
        return sum;
    } 
    
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int max_of_three_cons_ele = maxSumofThreeConsecutoveEle(arr);
        System.out.print("Maximum  of 3 Consecutive element is : "+max_of_three_cons_ele);

    }
}

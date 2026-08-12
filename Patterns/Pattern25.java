package Patterns;

public class Pattern25 {
    public static void main(String[] args) {
        int n=4;
        
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+"");
                
            }
            int rowValue = i;
            int decrementedRowValue = rowValue-1;
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(decrementedRowValue+"");
                decrementedRowValue--;
            }
            System.out.println();
        }
        // for(int i=1;i<n;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         count=1;
        //         if(i==1)
        //         {
        //             continue;
        //         }
        //         else
        //         {
        //             System.out.print(count+"");
        //         }
        //     }
        // }
    }
}

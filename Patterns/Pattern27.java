package Patterns;

public class Pattern27 {
    public static void main(String[] args) {
        int n=4;
        char ch;
        for(int i=1;i<=n;i++)
        {
            ch='A';
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+"");
                ch++;
            }
            // char rowvlaue= ch;
            // char decremented = rowvlaue--;
            // for(int j=1;j<=i-1;j++)
            // {
            //     System.out.print(decremented+"");
            //     decremented--;
            // }
            System.out.println();
        }
    }
    
}

package TwoDArrays;

import java.util.Scanner;

public class TwoD3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[4][];
        arr[0]= new int [2];
        arr[1]=new int [3];
        arr[2] = new int [4];
        arr[3] = new int [5];
        int rowlength = arr.length;
        for(int i =0;i<rowlength;i++)
        {
            int collength=arr[i].length;
            for (int j=0;j<collength;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
        //on the top i have assigned the cols length seprately.
        System.out.println("Print array");
        for(int i=0;i<rowlength;i++)
        {
            int collength=arr[i].length;
            for(int j=0;j<collength;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
    
}

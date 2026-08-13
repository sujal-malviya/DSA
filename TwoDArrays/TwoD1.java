package TwoDArrays;

public class TwoD1 {
    public static void main(String[] args) {
        // decalaration
        int arr[][];
        // allocation
        int arr1[][] = new int [2][3];
        //initialization
        int arr2[][]={
            {1,2,3},
            {2,3,4},
            {3,5,6}
        };
        // this initialised 2D array is of 3 rows , 3 columns.
        //printing 2D array
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                System.out.println("Value at "+i+" and "+j+" = "+arr2[i][j]);
            }
        }
    }
    
}

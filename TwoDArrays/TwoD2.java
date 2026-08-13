package TwoDArrays;

public class TwoD2 {
    public static void main(String[] args) {
        int arr[][] = {
            {1},
            {1,2},
            {1,2,3},
            {1,2,3,4}
        };
        System.out.println("I am jagged Array");
        // for the length of row what i will do is :
        int rowlength = arr.length;
        // as we know it is jagged array we can't direcly right arr[0].lenght to find cols length.
        // we will find with the help of rows like for particular rows value will be assign to collength;
        for(int i=0;i<rowlength;i++)
        {
            int collength =arr[i].length;
            for(int j=0;j<collength;j++)
            {
                System.out.print(" "+arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}

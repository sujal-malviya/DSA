package Arrays;

public class Array01 {
    public static void main(String[] args) {
        //declaration
        int arr[];
        //allocation
        int arr1[] = new int[5];
        //initialization
        int arr2[] = {1,2,3};

        //Access array by the help of index.
        System.out.println("Value at o index "+arr2[0]);
        System.out.println("Value at I index "+arr2[1]);

        // why to write sout again and again to print value . 
        // instead of that we can use for loop to print the value of array.
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println("Value at "+i+" is "+arr2[i]);
        }

    }
    
}

package Strings;

public class String03 {
    static void FindLength(String str)
    {
        char ch[] = str.toCharArray();
        int count = 0;
        for(char cc:ch)
        {
            count++;
        }
        System.out.println("Length of String is : "+count);
    }
    public static void main(String[] args) {
        String name="sujal";
        FindLength(name);
    }
    
}

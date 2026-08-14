package Strings;

public class String05 {
    static void ReverseString(String str)
    {
        char ch[] = str.toCharArray();
        int lenght = ch.length;
        System.out.print("Printing the value of string w/o reversing : ");
        for(int i=0;i<lenght;i++)
        {
            System.out.print(ch[i]+"");
        }
        System.out.println();
        System.out.print("After reversing : ");
        int start =0;
        int end = lenght-1;
        while(start<end)
        {
            char temp = ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<lenght;i++)
        {
            System.out.print(ch[i]+"");
        }
    }
    public static void main(String[] args) {
        String name = "sujal";
        ReverseString(name);
    }
    
}

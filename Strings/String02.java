package Strings;

public class String02 {
    static void printEachChar(String str)
    {
        System.out.println("First option: ");
        char ch[]=str.toCharArray();
        for(char c:ch)
        {
            System.out.println("value = "+c);
        }
        System.out.println("Second Option : ");
        int lenght = str.length();
        for(int i=0;i<lenght;i++)
        {
            System.out.println("Value at Index "+i+" is : "+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String name = "sujal";
        printEachChar(name);
    }
}

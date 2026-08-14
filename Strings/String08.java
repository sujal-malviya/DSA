package Strings;

import javax.lang.model.util.ElementScanner14;

public class String08 {
    static void toUpperCase(String str)
    {
        int length=str.length();
        for(int i=0;i<length;i++)
        {
            char ch=str.charAt(i);
            int value = ch;
            if(value>=65 && value<=90)
            {
                System.out.print(ch+"");
            }
            else if(value>=97 && value<=122)
            {
                value = value-32;
                ch = (char)value;
                System.out.print(ch+"");
            }
            else
            {
                System.out.print(ch+"");
            }
        }
    }
    public static void main(String[] args) {
        String name = "sujal122";
        toUpperCase(name);
    }
    
}

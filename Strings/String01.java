package Strings;

import java.util.Scanner;

public class String01 {
    static void Method1(String str,String sttr)
    {
        System.out.println("This method will compare Strings on basis of there address because both strings having same value so there are pointing to same literal in string pool so there address will be same which will be check by { == } operator.");
        if(str==sttr)
        {
            System.out.println("The refernce for both the strings is same .");
        }
        else
        {
            System.out.println("Refernce/address of both the string is diffrent .");
        }
    }
    static void Method2 (String str,String sttr)
    {
        System.out.println("checking actual value inside both string by comparing both of them .\n it is case sensative");
        if(str.equals(sttr))
        {
            System.out.println("Both are equal");
        }
        else
        {
            System.out.println("Both are not equal");
        }
    }
    static void Method3(String str,String sttr)
    {
        System.out.println("Comparing strings by using equalIgnoreCase to ignore case .");
        if(str.equalsIgnoreCase(sttr))
        {
            System.out.println("Both are equal.");
        }
        else
        {
            System.out.println("Both are not equal.");
        }
    }
    static void Method4(String str)
    {
        System.out.println("Other Methods ");
        System.out.println("To access elements from String using index");
        System.out.println(str.charAt(0));
        System.out.println("printing each character according to index");
        int length=str.length();
        for(int i=0;i<length;i++)
        {
            System.out.println("Value at Index "+i+" = "+str.charAt(i));
        }
    }
    static void Method5(String str)
    {
        System.out.println("getting Length of string using length function()");
        int length = str.length();
        System.out.println(length);
    }
    static void Method6(String str)
    {
        System.out.println("Converting String to UpperCase ");
        System.out.println(str.toUpperCase());
        System.out.println("Converting string to lowecase ");
        System.out.println(str.toLowerCase());

    }
    static void Method7(String str)
    {
        System.out.println("Checking if word is there inside string or not");
        String word = "al";
        if(str.contains(word))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    static void Method8(String str) {
        System.out.println("substring of String");
        System.out.println(str.substring(1,5));
    }
    static void Method9(String str)
    {
        System.out.println("Replacing Charater inside a string");
        System.out.println(str.replace("s","T"));

    }
    static void Method10(String str)
    {
        System.out.println("Checking prefix with the help of startswith() func");
        if(str.startsWith("s"))
        {
            System.out.println("True");
        }
        else
        {System.out.println("False");}
        System.out.println("checking suffix");
        if(str.endsWith("l"))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    static void Method11(String str)
    {
        System.out.println("Checking if string is empty . blank");
        System.out.println(str.isEmpty());// only true when nothing is inside the string . if a single space is there returns false
        System.out.println(str.isBlank());// only true when no character or string is inside string else it will return false.
    }
    static void inputstring()
    {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println("next will only store a word after a single space it will not store anything");
        System.out.println(str);
        String str2 = in.nextLine();
        System.out.println("It will store string with spaces");
        System.out.println("Value = "+str2 );
        System.out.println("trim the spaces of string.\nleading and trailing spaces will be removed.");
        String str3 = in.nextLine();
        System.out.println(str3.trim());
    }
    static void Method12(String str)
    {
        System.out.println("spliting string with help of split() func");
        System.out.println(str.split(" ,"));
    }
    static void Method13()
    {
        System.out.println("Converting any other datatype to String by the help of Valueof() func");
        int a = 10;
        String name = String.valueOf(a);
        System.out.println("Value of a :"+a);
        System.out.println("Value of name is : "+name);
        name = name+1;
        System.out.println("Concatenated value : "+name);
    }
    static void Method14(String str)
    {
        System.out.println("Converting string to char []");
        char ch[] = str.toCharArray();
        for(char ch1:ch)
        {
            System.out.println("Value of char is :"+ch1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Go through diffrent String methods");
        String str = "sujal";
        String sttr ="sujal";
        // Both the Strings which are there are refering to same literal ;
        // str and sttr are 2 refernces where String is class and str and sttr are the reference varaibles.
        Method1(str, sttr);
        Method2(str, sttr);
        Method3(str, sttr);
        Method4(str);
        Method5(str);
        Method6(str);
        Method7(str);
        Method8(str);
        Method9(str);
        Method10(str);
        Method11(str);
        Method12(str);
        Method13();
        Method14(str);
        inputstring();
    }
}

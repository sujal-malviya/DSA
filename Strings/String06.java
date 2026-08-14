package Strings;

public class String06 {
    static boolean isPallindrome(String str)
    {
        int length = str.length();
        str = str.toLowerCase();
        int start=0;
        int end=length-1;
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String name ="MAdam";
        boolean result = isPallindrome(name);
        System.out.print("String is Pallindrome : "+result);
    }
}

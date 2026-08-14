package Strings;

public class String07 {
    static int CountConsonant(String str)
    {
        int length = str.length();
        int count = 0;
        for(int i=0;i<length;i++)
        {
            char ch = str.charAt(i);
            if(ch>='a' || ch<='z' || ch>='A' || ch<='Z')
            {
                if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' ||ch=='O' ||ch=='U')
                {
                    continue;
                }
                count++;
            }
        }    
        return count;
    }
    public static void main(String[] args) {
        String name = "sujal";
        int result = CountConsonant(name);
        System.out.println("Count is : "+result);
    }
    
}

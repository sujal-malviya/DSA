package Strings;

public class String09 {
    static void Frequency(String str)
    {
        int length = str.length();
        for(int i =0;i<length;i++)
        {
            char ch1= str.charAt(i);
            int count = 0;
            for(int j=0;j<length;j++)
            {
                char ch2 = str.charAt(j);
                if(ch1==ch2)
                {
                    count++;
                }
            }
            System.out.println("Frequency of "+ch1+" is : "+count);
        }
    }
    public static void main(String[] args) {
        String name = "sujals";
        Frequency(name);

    }
    
}

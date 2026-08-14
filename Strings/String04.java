package Strings;

public class String04 {
    static int CountVowels(String str)
    {
        char arr[] = str.toCharArray();
        int length = arr.length;
        int count =0;

        for(int i=0;i<length;i++)
        {
            char c = Character.toLowerCase(arr[i]);
            if(c=='a' || c=='o' || c=='e' || c=='i' || c=='u')
            {
                count++;
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        String name = "sneha";
        int result = CountVowels(name);
        System.out.println("Vowel Count is : "+result);
    }
    
}

package Methods;

public class Method8 {
    static int GetValue(int a)
    {
        a = a*10;
        return a ;
    }
    static String GetValue(String str)
    {
        return str;
    }
    public static void main(String[] args) {
        int result = GetValue(10);
        String result1 = GetValue("hello");
        System.out.println(result);
        System.out.println(result1); 
    }
}

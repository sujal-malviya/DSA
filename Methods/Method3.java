package Methods;

public class Method3 {
    static void ChangeValue(int num)
    {
        num = num +50;
        System.out.println(num);
    }
    public static void main(String[] args) {
        int num = 10;
        ChangeValue(num);
        System.out.println(num);
    }
    
}

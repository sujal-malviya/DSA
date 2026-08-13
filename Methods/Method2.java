package Methods;

public class Method2 {
    //Method overloading where the method name should be same but there
    //  will be diffrent parameters so when calling method from main 
    // and passing arguments basis of args the method will be called.

    static int add(int a,int b)
    {
        return a+b;
    }
    static int add(int a ,int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        int result = add(1,2);
        int result1=add(1,2,3);

        System.out.println(result);
        System.out.println(result1);
    }
    
}

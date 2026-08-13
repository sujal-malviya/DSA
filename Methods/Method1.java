package Methods;

public class Method1 {
    static void tableOfN(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
        }

    }
    public static void main(String[] args) {
        tableOfN(5);
    }
    
}

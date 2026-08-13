package Methods;

public class Method7 {
    static float GetPercentage(float obtain,float total)
    {
        float result = (obtain/total)*100;
        return result;
    }
    public static void main(String[] args) {
        float getresult = GetPercentage(400.0f,500.0f);
        System.out.println(getresult);

    }
    
}

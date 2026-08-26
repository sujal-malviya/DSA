package Polymorfism.Oveloading;
import Polymorfism.Oveloading.Poly;
public class Main {
    public static void main(String[] args) {

        Poly poly = new Poly();
        int result = poly.add(1,2);
        int result2 =  poly.add(1,2,3);
        double result3 = poly.add(1,1.0);
        System.out.println("Function/Method Overloading");
        System.out.println(result+" \n "+result2+"\n"+result3);
    }
}
// overlaoding can be done within the class .
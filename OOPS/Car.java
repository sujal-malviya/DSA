package OOPS;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    String model;
    String color;
    int year;

    public Car(String model,String color,int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    int getCaryear()
    {
        return year;
    }

    String getCarcolor()
    {
        return color;
    }

    List<Object> getCarDetails()
    {
        return Arrays.asList(model,color,year);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota fortuner legender","red",2019);

        
       for(Object ob : car.getCarDetails())
       {
        System.out.println(ob);
       }
    }
    

    
}

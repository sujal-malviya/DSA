package OOPS;

import java.util.Arrays;
import java.util.List;

public class House {
    String name ;
    String address;
    double price;
    
    // parametrized constructor
    public House(String name ,String address, double price) {
        this.name=name;
        this.address=address;
        this.price=price;
    }

    public List<Object> getHouseDetail()
    {
        return Arrays.asList(name,address,price);
    }
    //copy constructor
    public House(House house)
    {
        this.name = house.name;
        this.address = house.address;
        this.price = house.price;
    }

    public static void main(String[] args) {
        House house = new House("Vayu Niwas","Pionier lakedistrict",1.5);
        for(Object ob : house.getHouseDetail())
        {
            System.out.println(ob);
        }
        System.out.println("Copy constructor called!!!");
        House house1 = new House(house);
        for(Object ob : house1.getHouseDetail())
        {
            System.out.println(ob);
        }
        

    }

    
}

package OOPS.Car;

public class Car {
    String model;
    String brand;
    float price;

    void displayInfo()
    {
        System.out.println("\nBrand : "+brand+" \nModel : "+model+"\nPrice : "+price);
    }
    public static void main(String []args)
    {
        Car car = new Car();
        car.brand = "BMW";
        car.model="M2 series";
        car.price = 50.5f;
        car.displayInfo();
    }
}

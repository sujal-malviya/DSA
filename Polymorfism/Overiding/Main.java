package Polymorfism.Overiding;

public class Main {
    public static void main(String[] args) {
        System.out.println(
        "Function/method overriding..."
        );
        Shape shape = new Shape();
        shape.draw();
        Circle circle = new Circle();
        circle.draw();
        Rect rect = new Rect();
        rect.draw();
    }
}

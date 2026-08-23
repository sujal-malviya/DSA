package OOPS;

public class Student {
    int id;
    String name;
    int age;
    int nos;
    // constructor call 
    public Student() {
        System.out.println("Student constructor called");
    }
    void sleep()
    {
        System.out.println("Student is sleeping");
    }
    void eat()
    {
        System.out.println("Student is eating");
    }
    void bunk()
    {
        System.out.println("Student is bunking");
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.id =1;
        student.name="sujal";
        student.age=22;
        student.nos=5;
        System.out.println(student.age);
        System.out.println(student.id);
        System.out.println(student.name);
        System.out.println(student.nos);
        student.eat();
        student.bunk();
        student.sleep();

    }
}

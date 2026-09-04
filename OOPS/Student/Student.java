package OOPS.Student;

public class Student {
    private int id;
    private String name;
    private String email;
    private float marks;

    Student(int id, String name, String email, float marks)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.marks=marks;
    }

    public void displayInfo()
    {
        System.out.print("Name : "+name+"\nemail : "+email+"\nmarks : "+marks+"\n");
    }
    public static void main(String []args)
    {
        Student student = new Student(1,"sujal","sujal@gmail.com",92f);
        student.displayInfo();
        Student student2 = new Student(2,"Ridhi","ridhi@gmail.com",92f);
        student2.displayInfo();
    }
    
}

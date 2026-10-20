class Student
{
    private String name = "SRI DEVI";      // Private
    int rollNo = 25;                       // Default
    protected int marks = 93;              // Protected
    public String college = "ABC College"; // Public

    public void display()
    {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks   : " + marks);
        System.out.println("College : " + college);
    }
}

public class AccessSpecifierDemo
{
    public static void main(String[] args)
    {
        Student obj = new Student();
        obj.display();
    }
}

interface Student
{
    void display();
}

class Details implements Student
{
    @Override
    public void display()
    {
        System.out.println("Student Details");
        System.out.println("================");
        System.out.println("Name       : MEENATCHI");
        System.out.println("Roll No    : 14");
        System.out.println("Marks 1    : 93");
        System.out.println("Marks 2    : 84");
        System.out.println("Percentage : 88.5%");
    }
}

public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Details obj = new Details();
        obj.display();
    }
}

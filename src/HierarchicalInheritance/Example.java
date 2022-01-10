package HierarchicalInheritance;

class Shape
{
    public void display()
    {
        System.out.println("running display method ...");
    }
}
class Rectangle extends Shape
{
    public void area()
    {
        System.out.println("running area method ...");
    }
}
class Square extends Shape
{
    public void volume()
    {
        System.out.println("running volume method ...");
    }
}
public class Example
{
    public static void main(String[] args)
    {
        Square s = new Square();
        s.volume();
        s.display();
        Rectangle r = new Rectangle();
        r.area();
        r.display();
    }
}

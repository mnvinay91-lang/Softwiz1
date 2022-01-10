package MultilevelInheritance;

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
class Cube extends Rectangle
{
    public void volume()
    {
        System.out.println("running volume method ...");
    }
}
public class TestShape
{
    public static void main(String[] args)
    {
        Cube c = new Cube();
        Rectangle r = new Rectangle();
        r.area();
        r.display();

        c.display();
        c.area();
        c.volume();
    }
}
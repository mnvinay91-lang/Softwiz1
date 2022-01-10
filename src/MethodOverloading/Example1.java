package MethodOverloading;

public class Example1
{
    public void display()
    {
        System.out.println("running display method - zero argumented");
    }

    public void display(int i)
    {
        System.out.println("running display method - integer argumented");
    }
    public void display(String s)
    {
        System.out.println("running display method - string argumented");
    }

    public static void main(String[] args)
    {
        Example1 e = new Example1();
        e.display();
        e.display(10);
        e.display("hello");
    }
}

package RunTimeExceptions;

public class ExampleWithThrows
{
    public static void main(String[] args) throws ArithmeticException
    {
        ExampleWithThrows obj = new ExampleWithThrows();
        obj.sum();
        System.out.println("ABC");
    }
    public void sum()
    {
        try
        {
            div();
        }
        catch(Exception e)
        {
            System.out.println("Arithmetic exception caught");
        }
    }
    public void div()
    {
        int i = 9/0; //exception line
        System.out.println(i);
    }
}


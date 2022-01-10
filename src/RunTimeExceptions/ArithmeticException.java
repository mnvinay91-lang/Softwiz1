package RunTimeExceptions;

public class ArithmeticException extends Throwable {
    public void ArithExc()
    {
        try
        {
           int i = 9/0;
        }
        catch(Throwable e)
        {
         e.printStackTrace();
         System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Arithmetic exception caught successfully");
        }
    }
    public static void main(String[] args)
    {
        ArithmeticException ae = new ArithmeticException();
        ae.ArithExc();
    }
}

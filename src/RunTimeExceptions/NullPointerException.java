package RunTimeExceptions;

public class NullPointerException
{
    public static void main(String[] args)
    {
        String s = null;

        try
        {
            if(s.equals("Softwiz"))
                System.out.println("value is assgined");
            else
                System.out.println("value is not assgined and it is a null value");
        }
        catch(Exception e)
        {
            System.out.println("caught null pointer exception..");
            System.out.println(e.getMessage());
        }
    }
}

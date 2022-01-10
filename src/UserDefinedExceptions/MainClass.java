package UserDefinedExceptions;
import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the age");
        int age = scan.nextInt();

        RegistrationForDL reg = new RegistrationForDL();

        try
        {
            reg.registration(age);
        }
        catch(AgeInvalidException e)
        {
            System.out.println(e.GetMessage());
        }
        finally
        {
            scan.close();
        }
    }
}



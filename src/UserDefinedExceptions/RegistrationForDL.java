package UserDefinedExceptions;

public class RegistrationForDL
{
    public void registration(int age)
    {
        if(age>=18 && age <=65)
        {
            System.out.println("eligible for getting driving license..");
        }
        else
        {
            throw new AgeInvalidException();
        }
    }
}



package UserDefinedExceptions;

public class AgeInvalidException extends RuntimeException
{
    private final String message = "not eligible for getting driving license..";

    public String GetMessage()
    {
        return message;
    }
}

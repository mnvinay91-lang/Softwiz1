package RunTimeExceptions;
import java.util.Scanner;

public class NumberFormatException
{
    public static void main(String[] arg)
    {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any valid integer value ....");

            try
            {
                number = Integer.parseInt(scan.next());
                System.out.println("You entered: " + number);
            }
            catch (Exception e)
            {
                System.out.println("NumberFormatException occured");
            }
        }
    }


package RunTimeExceptions;
public class ArrayIndexOutOfBoundException extends Exception
{
    public static void main(String[] args)
    {
        int array[] = new int[5];
        System.out.println("size of array is:"+array.length);
       try
       {
           //iniitilize the array
           array[0] = 1;
           array[1] = 2;
           array[2] = 3;
           array[3]= 4;
           array[4]= 5;
           array[5]= 6;
       }
       catch (Exception e)
       {
           e.printStackTrace();
           System.out.println("message is:"+e.getMessage());
       }
       finally
       {
           System.out.println("Array index out of bound exception caught successfully");
       }
    }
}

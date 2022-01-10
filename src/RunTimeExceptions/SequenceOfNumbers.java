package RunTimeExceptions;

//example for Interrupted exception - runtime
public class SequenceOfNumbers
{
    public void sequence(int start, int end) throws InterruptedException
    {
     for(int i = start;i<=end;i++)
     {
       System.out.println("value of i is:"+i);
       //Thread.sleep(2000);
     }
    }
    public static void main(String[] args) throws InterruptedException
    {
       SequenceOfNumbers seq = new SequenceOfNumbers();
       seq.sequence(0,9);
   }
}


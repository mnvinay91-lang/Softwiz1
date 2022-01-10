package Interface;

public class Mainclass
{
    public static void main(String[] args)
    {
    Bank b = new HDFCBank();
    b.loan();
    b.credit();
    b.debit();

    HDFCBank hb = new HDFCBank();
     hb.vehicleloan();
      hb.credit();
      hb.debit();
     }
    }


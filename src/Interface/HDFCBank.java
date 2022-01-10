package Interface;
public class HDFCBank implements Bank
{
        public void loan()
        {
            System.out.println("running Loan method for HDFC bank");
        }

        public void credit()
        {
            System.out.println("running credit method for HDFC bank");
        }

        public void debit()
        {
            System.out.println("running debit method for HDFC bank");
        }
        //non – overriding method
        public void vehicleloan()
        {
            System.out.println("running vehicle loan method for HDFC bank");
        }
}
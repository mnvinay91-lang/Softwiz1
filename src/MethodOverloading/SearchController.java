package MethodOverloading;

public class SearchController
{
    public void SearchTicket(long l)
    {
        System.out.println("searching ticket by mobile number");
    }

    public void SearchTicket(int PNRno)
    {
        System.out.println("searching ticket by PNR number");
    }

    public static void main(String[] args)
    {
        SearchController s = new SearchController();
        s.SearchTicket(8309878925l);
        s.SearchTicket(672347656);
    }
}

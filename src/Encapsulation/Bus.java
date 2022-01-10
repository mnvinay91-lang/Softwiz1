package Encapsulation;

public class Bus
{
    //private data members
    private int no_of_seats;
    private String Bus_no;
    private String Bus_type;
    private String Service_Code;
    private long mobile_number;

    //getter and setter for number of seats
    public int getNo_of_seats()
    {
        return no_of_seats;
    }

    public void setNo_of_seats(int no_of_seats)
    {
        this.no_of_seats = no_of_seats;
    }

    //getter and setter for bus number
    public String getBus_no()
    {
        return Bus_no;
    }

    public void setBus_no(String bus_no)
    {
        Bus_no = bus_no;
    }

    //getter and setter for bus type
    public String getBus_type()
    {
        return Bus_type;
    }

    public void setBus_type(String bus_type)
    {
        Bus_type = bus_type;
    }

    //getter and setter for service code
    public String getService_Code()
    {
        return Service_Code;
    }

    public void setService_Code(String service_Code)
    {
        Service_Code = service_Code;
    }

    //getter and setter for mobile number

    public long getMobile_number()
    {
        return mobile_number;
    }

    public void setMobile_number(long mobile_number)
    {
        this.mobile_number = mobile_number;
    }

    public static void main(String[] args)
    {
        Bus b = new Bus();
        b.setNo_of_seats(45);
        b.setBus_no("KA 05 EZ 3451");
        b.setBus_type("Airavat");
        b.setService_Code("4522");
        b.setMobile_number(9876277832l);

        System.out.println("bus seating capacity is:"+b.getNo_of_seats());
        System.out.println("bus number is:"+b.getBus_no());
        System.out.println("bus type is:"+b.getBus_type());
        System.out.println("bus service code is:"+b.getService_Code());
        System.out.println("mobile number is:"+b.getMobile_number());


    }
}

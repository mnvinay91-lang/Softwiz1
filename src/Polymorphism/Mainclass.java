package Polymorphism;

class Car
{
    public void carspeed()
    {
        System.out.println("Estimating maximum speed of a car");
    }
}

class MaruthiSuzuki extends Car
{
    public void carspeed()
    {
        System.out.println("maximum speed of maruthi suzuki is: 120kmph");
    }
}

class TATA extends Car
{
    public void carspeed()
    {
        System.out.println("maximum speed of TATA is: 135kmph");
    }
}

class Mainclass
{
    public static void main(String[] args)
    {
        Car c = new Car();
        Car MS = new MaruthiSuzuki();
        Car TATA = new TATA();
        c.carspeed();
        MS.carspeed();
        TATA.carspeed();

    }
}
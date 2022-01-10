package AccessSpecifiersDefault;

//no access specifier is specified - can be accessed in same package only.
class Mainclass
{
    public static void main(String[] args)
    {
        Sample s = new Sample();
        System.out.println("value of a is:"+ s.a);
        s.display();
    }
}
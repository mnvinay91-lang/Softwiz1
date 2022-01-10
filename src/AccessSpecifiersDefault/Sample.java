package AccessSpecifiersDefault;
// no access specifier is used to represent class, method, constructor and a variable
class Sample
{
    int a = 10;

    Sample()
    {
        System.out.println("running sample constructor in Sample class");
        System.out.println("value of a is:"+a);
    }

    void display()
    {
        System.out.println("running display method in sample class");
        System.out.println("value of a is:"+a);
    }
}
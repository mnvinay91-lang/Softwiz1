package AccessSpecifiersPublicP2;
import AccessSpecifiersPublicP1.*; //imported package P1

public class Mainclass
{
    public static void main(String[] args)
    {
        ClassP p = new ClassP(); //runs public constructor from public class(ClassP), derived from PackageP1
        p.method1(); //runs public method from public class(ClassP), derived from PackageP1
        System.out.println("value of x is:"+ p.x); //prints the member variable from public class(ClassP), derived from PackageP1
    }
}

package AccessSpecifiersPrivate;

public class ClassA //private class not allowed
{
    private int j = 56;

    private void Test()
    {
        System.out.println("running private test method in ClassA");
    }

    private ClassA()
    {
        System.out.println("running private constructor ClassA ");
    }

    public static void main(String[] args) //If main class is created outside the class,
    {                                      // constructor, member variable and method cannot be accessed
                                           //outside the package also it cannot be accessed
        ClassA a = new ClassA();
        System.out.println("value of j is:"+a.j);
        a.Test();
    }
}


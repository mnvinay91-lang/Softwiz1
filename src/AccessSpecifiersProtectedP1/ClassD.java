package AccessSpecifiersProtectedP1;

public class ClassD //class cannot be made protected
{
    protected double d = 56.34;

    protected void view()
    {
        System.out.println("running protected view method in ClassD.. ");
    }

    protected ClassD()
    {
        System.out.println("running protected constructor ClassD.. ");
    }
}

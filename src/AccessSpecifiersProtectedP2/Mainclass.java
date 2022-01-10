package AccessSpecifiersProtectedP2;

import AccessSpecifiersProtectedP1.*; //Package imported

public class Mainclass extends ClassD
{
    public static void main(String[] args)
    {
        Mainclass M = new Mainclass(); //runs constructor from ClassD (protected) from package P1
        M.view();    //runs method from ClassD (protected) from package P1
        System.out.println("value of variable d is:"+M.d); //prints variable value d which is protected from package P1
    }
}

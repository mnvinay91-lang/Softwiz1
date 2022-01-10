package SingleInheritance;
public class Child extends Father
{
    int child_age = 22;
    String child_name = "Arjun";

    public void BattingStatsOfSon()
    {
        System.out.println("running batting method in child class");
    }

    public void BowlingStatsOfSon()
    {
        System.out.println("running bowling method in child class");
    }


    //main class
    public static void main(String[ ] args)
    {
     //create obj of child class
        Child c = new Child();

        System.out.println("age of father is:"+c.father_age);
        System.out.println("name of father is:"+c.father_name);
        c.BattingStatsOfFather();
        c.BowlingStatsOfFather();

        System.out.println("age of child is:"+c.child_age);
        System.out.println("name of father is:"+c.child_name);
        c.BattingStatsOfSon();
        c.BowlingStatsOfSon();
    }
}

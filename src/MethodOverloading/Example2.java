package MethodOverloading;

public class Example2
{
    public double add(int a, int b)
    {
        double result1 = a+b;
        return a+b;
    }

    public double add(int a, int b, double c)
    {
        double result2 = a+b+c;
        return a+b+c;
    }

    public double add(double a, int b, int c)
    {
        double result3 = a+b+c;
        return a+b+c;
    }

    public static void main(String[] args)
    {
        Example2 e = new Example2();

        double result1 = e.add(23,56);
        System.out.println("addition of 2 integer values is:"+ result1);

        double result2 =  e.add(45.67,56,89);
        System.out.println("addition of 3 values is:"+ result2);

        double result3 = e.add(34,56,78.45);
        System.out.println("addition of 3  values is:"+ result3);
    }
}

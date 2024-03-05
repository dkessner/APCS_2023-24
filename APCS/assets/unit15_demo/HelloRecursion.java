//
// HelloRecursion.java
//


public class HelloRecursion
{
    public static int factorial(int n)
    {
        if (n == 0)
            return 1;
        
        return n * factorial(n-1);
    }


    public static void f()
    {
        System.out.println("Hello");
        //f();
    }

    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        for (int i=0; i<10; i++)
            System.out.println(i + "! == " + factorial(i));

        f();
    }
}



 

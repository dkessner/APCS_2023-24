//
// CircleTest.java
//


public class CircleTest
{
    public static void testCircleArea(Circle c, double expected)
    {
        double result = c.area();

        System.out.print("circle radius: " + c.getRadius() +
                " result: " + result + " expected: " + expected);

        // if (result == expected) // don't do this

        if (Math.abs(result - expected) < .001) // do fuzzy comparison
            System.out.println(" Yay!!!!");
        else
            System.out.println(" Bummer");
    }

    public static void main(String[] args)
    {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(10);

        testCircleArea(c1, 3.14159);
        testCircleArea(c2, 314.159);

        System.out.println("shape: " + Circle.shapeName);

        // Circle.shapeName = "Rectangle"; // error if final
        //System.out.println("shape: " + Circle.shapeName);
    }
}



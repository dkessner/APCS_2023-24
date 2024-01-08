//
// Circle.java
//


public class Circle implements Shape
{
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public String getName()
    {
        return "Circle " + radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    private double radius;
}



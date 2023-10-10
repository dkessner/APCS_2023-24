//
// Circle.java
//


public class Circle
{
    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double area()
    {
        return Math.PI * radius * radius; 

        // alternative:
        //return Math.PI * Math.pow(radius, 2);
    }

    public double circumference()
    {
        return 2 * Math.PI * radius;
    }

    private double radius;

    // static: one copy per class (not per object)
    // final: can't be changed
    public static final String shapeName = "Circle"; 
}



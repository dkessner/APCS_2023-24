//
// Rectangle.java
//


public class Rectangle implements Shape
{
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public String getName()
    {
        return "Rectangle " + width + "x" + length;
    }

    public double getPerimeter()
    {
        return 2*width + 2*length;
    }

    public double getArea()
    {
        return width * length;
    }

    private double width;
    private double length;
}



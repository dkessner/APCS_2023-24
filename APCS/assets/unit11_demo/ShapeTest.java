//
// ShapeTest.java
//


import java.util.*;


public class ShapeTest
{
    public static void main(String[] args)
    {
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        Rectangle r1 = new Rectangle(3, 4);
        shapes.add(r1);

        shapes.add(new Rectangle(10, 20));
        shapes.add(new Circle(1));
        shapes.add(new Circle(10));

        // here we don't care what kind of Shape!

        for (Shape s : shapes)
        {
            System.out.println(s.getName());
            System.out.println(s.getPerimeter());
            System.out.println(s.getArea());
            System.out.println();
        }
    }
}



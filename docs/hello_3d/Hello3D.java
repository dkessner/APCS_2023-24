//
// Hello3D.java
//


import processing.core.*;


public class Hello3D extends PApplet
{
    public void settings()
    {
        size(400, 400, P3D);
    }

    public void setup()
    {

    }

    public void draw()
    {
        background(0);
        sphere(100);
    
    }

    public static void main(String[] args)
    {
        PApplet.main("Hello3D");
    }
}



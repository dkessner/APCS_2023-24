//
// Person.java
//


public class Person
{
    public Person(String name)
    {
        this.name = name;
    }

    public void hello()
    {
        System.out.println("Hello, world!  I am a Person and my name is " + name);
    }

    public String getName()
    {
        return name;
    }

    private String name;
    // protected String name; // allow access to subclasses
}


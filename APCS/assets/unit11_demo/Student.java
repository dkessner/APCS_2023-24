//
// Student.java
//



// Student is a subclass of Person
// Student inherits from Person
// Student "is a" Person


public class Student extends Person
{
    public Student(String name)
    {
        //this.name = name; // we want to do this

        super(name); // call superclass constructor
    }

    // overrides Person.hello()

    public void hello()
    {
        System.out.println("Hello, I am a Student and my name is " + getName());
    }

}



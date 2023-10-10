//
// Person.java
//


public class Person
{
    public Person(String nameIn, int favoriteNumberIn)
    {
        name = nameIn;
        favoriteNumber = favoriteNumberIn;
    }

    public void hello()
    {
        System.out.println("Hello, my name is " + name);
    }

    public int getFavoriteNumber() // accessor function
    {
        return favoriteNumber;
    }

    public void setFavoriteNumber(int favoriteNumberIn) // mutator function
    {
        favoriteNumber = favoriteNumberIn; 
    }

    private String name; // private member variable
    private int favoriteNumber; 

    //public String name; // don't do this: no public variables
}



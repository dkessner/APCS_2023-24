//
// Pet.java
//


public class Pet
{
    public Pet(String name, String greeting, int fleaCount)
    {
        this.name = name;
        this.greeting = greeting;
        this.fleaCount = fleaCount;
    }

    public String getName() {return name;}
    public String getGreeting() {return greeting;}
    public int getFleaCount() {return fleaCount;}

    private String name;
    private String greeting;
    private int fleaCount;
}



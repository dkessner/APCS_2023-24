//
// Animal.java
//


public class Animal
{
    public Animal(String name, String type, int legCount,
            double age, String color, boolean isParty)
    {
        this.name = name;
        this.type = type;
        this.legCount = legCount;
        this.age = age;
        this.color = color;
        this.isParty = isParty;
    }

    public String name() {return name;}
    public String type() {return type;}
    public int legCount() {return legCount;}
    public double age() {return age;}
    public String color() {return color;}
    public boolean isParty() {return isParty;}

    public String toString() {return name + " " + type;}

    private String name;
    private String type;
    private int legCount;
    private double age;
    private String color;
    private boolean isParty;
}



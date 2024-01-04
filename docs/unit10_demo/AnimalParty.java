//
// AnimalParty.java
//


import java.util.*;


public class AnimalParty
{
    public static void print(ArrayList<Animal> animals)
    {
        for (Animal a : animals)
            System.out.println(a.name() + " " + a.type());
    }

    public static double averageAge(ArrayList<Animal> animals)
    {
        double sum = 0;
        for (Animal a : animals)
            sum += a.age();
        return sum / animals.size();
    }

    public static ArrayList<Animal> getPartyAnimals(ArrayList<Animal> animals)
    {
        // filter for party animals

        ArrayList<Animal> result = new ArrayList<Animal>();

        for (Animal animal : animals)
            if (animal.isParty())
                result.add(animal);

        return result;
    }

    public static String[] getColors(ArrayList<Animal> animals)
    {
        String[] result = new String[animals.size()];
        
        for (int i=0; i<result.length; i++)
        {
            result[i] = animals.get(i).color();
        }

        return result;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello, world!");

        Animal gadget = new Animal("Gadget", "Cat", 4, 3, 
                "Black and White", true);

        Animal tux = new Animal("Tux", "Cat", 4, 3, 
                "Black and White", false);

        Animal hokeypokey = new Animal("Hokey Pokey", "Tortoise",
                4, 30, "Green", false);

        Animal kiki = new Animal("Kiki", "Chicken", 2, 3.5, 
                "Brown", true);

        Animal coco = new Animal("Coco", "Dog", 4, 9, 
                "Black and Brown", true);

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(gadget);
        animals.add(tux);
        animals.add(hokeypokey);
        animals.add(kiki);
        animals.add(coco);

        print(animals);
        System.out.println("average age: " + averageAge(animals));

        System.out.println("party animals:");
        System.out.println(getPartyAnimals(animals));

        System.out.println("colors:");
        String[] colors = getColors(animals);
        for (String c : colors)
            System.out.println(c);
    }
}



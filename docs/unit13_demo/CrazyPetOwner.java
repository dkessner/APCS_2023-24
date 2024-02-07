//
// CrazyPetOwner.java
//


import java.util.*;


public class CrazyPetOwner
{
    public CrazyPetOwner()
    {
        pets = new ArrayList<Pet>();
    }

    public void addPet(String name, String greeting, int fleaCount)
    {
        Pet pet = new Pet(name, greeting, fleaCount);
        pets.add(pet);
    }

    public void greet()
    {
        for (Pet p : pets)
            System.out.println(p.getName() + ": " + p.getGreeting());
    }

    public float getFleaDensity()
    {
        float total = 0;
        for (Pet p : pets)
            total += p.getFleaCount();
        return total / pets.size();
    }

    private ArrayList<Pet> pets;
}



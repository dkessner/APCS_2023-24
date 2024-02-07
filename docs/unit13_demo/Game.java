//
// Game.java
//


public class Game
{
    public static void main(String[] args)
    {
        CrazyPetOwner drkessner = new CrazyPetOwner();
        drkessner.addPet("Gadget", "grunt snort", 10);
        drkessner.addPet("Tux", "sniff sniff", 20);
        drkessner.addPet("Swan", "bock honk", 0);
        drkessner.addPet("Elvis", "grrr", 3);
        drkessner.addPet("Scout", "yip yip", 17);

        drkessner.greet();

        System.out.println("flea density: " + drkessner.getFleaDensity()); 
    }
}



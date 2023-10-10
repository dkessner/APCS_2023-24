//
// HelloClasses.java
//


public class HelloClasses
{
    public static void main(String[] args)
    {
        int n = 5;
        float x = 1.23f;
        String s = "hello";

        Person p = new Person("Dr. Kessner", 0x29a);

        // p.name = "Dr. Kessner"; // only if 'name' is public

        p.hello();

        System.out.println("favorite number: " + p.getFavoriteNumber());        

        p.setFavoriteNumber(7);
        System.out.println("favorite number: " + p.getFavoriteNumber());        


    }
}



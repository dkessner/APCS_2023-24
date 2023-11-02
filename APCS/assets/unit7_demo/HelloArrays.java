//
// HelloArrays.java
//


public class HelloArrays
{
    public static void main(String[] args)
    {
        int[] values = {1, 3, 5, 7};

        for (int n : values) // for-each loop
        {
            System.out.println(n);
        }

        System.out.println("values.length: " + values.length); // not a function

        for (int i=0; i<values.length; i++) // for loop (over indices)
        {
            int n = values[i];
            System.out.println(n);
        }

        String[] names = {"Sydney", "Mia", "Wynter", "Nina"}; // array literal

        for (String name : names)
            System.out.println(name);

        System.out.println("names.length: " + names.length);
        names[0] = "Nola";

        for (int i=0; i<names.length; i++)
        {
            String name = names[i];
            System.out.println(name);
        }

        double[] temperatures = new double[3]; // create a new empty array
        temperatures[0] = 89;
        temperatures[1] = 99;
        temperatures[2] = 101;
    }
}



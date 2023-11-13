//
// HelloArrayAlgorithms.java
//


import java.util.*;


public class HelloArrayAlgorithms
{
    public static int findMin(int[] values)
    {
        int smallest = values[0];

        for (int nola : values)
        {
            if (nola < smallest)
                smallest = nola;
        }

        return smallest;
    }


    public static ArrayList<Integer> filterGood(int[] values)
    {
        ArrayList<Integer> good = new ArrayList<Integer>();

        for (int x : values)
        {
            if (x >= 100)
                good.add(x);
        }

        return good;
    }


    public static int[] getLengths(String[] names)
    {
        // transform a list

        int[] result = new int[names.length];

        for (int i=0; i<names.length; i++)
        {
            result[i] = names[i].length();
        }

        return result;
    }

    public static ArrayList<String> generateFizzBuzz(int n)
    {
        ArrayList<String> result = new ArrayList<String>();

        for (int i=0; i<=n; i++)
        {
            if (i%15 == 0)
                result.add("FizzBuzz");
            else if (i%3 == 0)
                result.add("Fizz");
            else if (i%5 == 0)
                result.add("Buzz");
            else
                result.add("" + i);
        }

        return result;
    }

    public static void main(String[] args)
    {
        int[] values = {90, 100, 110, 120, 70, 130, 80};

        int smallest = findMin(values);
        System.out.println("smallest: " + smallest);
        System.out.println();

        ArrayList<Integer> goodScores = filterGood(values);
        System.out.println("goodScores: " + goodScores);
        System.out.println();

        String[] names = {"Nola", "Nina", "Jane", 
            "Sydney", "Mia", "Wynter"};

        int[] lengths = getLengths(names);
        System.out.println("lengths: " + lengths); // prints memory location
        for (int x : lengths)
            System.out.print(x + " ");
        System.out.println();
        System.out.println();

        ArrayList<String> fizzes = generateFizzBuzz(30);
        System.out.println("fizzes: " + fizzes);
    }
}



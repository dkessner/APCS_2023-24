//
// HelloAlgorithms.java
//


public class HelloAlgorithms
{
    public static int findFirstE(String s)
    {
        for (int i=0; i<s.length(); i++)
        {
            String sub = s.substring(i, i+1);
            if (sub.equals("e"))
                return i;
        }

        return -1;
        // return s.length()
    }

    public static int countE(String s)
    {
        int count = 0;

        for (int i=0; i<s.length(); i++)
        {
            String sub = s.substring(i, i+1);

            if (sub.equals("e"))
                count++;
        }

        return count;
    }

    public static int sum(int n) // return 1 + 2 + ... + n
    {
        int total = 0;

        for (int i=1; i<=n; i++)
        {
            total += i;
        }

        return total;
    }

    public static String binimate(String s)
    {
        String result = "";

        /*
        for (int i=1; i<s.length(); i+=2)
        {
            String sub = s.substring(i, i+1);
            result += sub;
        }
        */

        for (int i=0; i<s.length(); i++)
        {
            String sub = s.substring(i, i+1);
            if (i%2 == 1)
                result += sub;
        }

        return result;
    }

    public static void main(String[] args)
    {
        String s = "Dr. Kessner";
        System.out.println("firstE " + s + " " + findFirstE(s));

        s = "Sydney";
        System.out.println("firstE " + s + " " + findFirstE(s));

        s = "Nola";
        System.out.println("firstE " + s + " " + findFirstE(s));

        s = "Dr. Kessner";
        System.out.println("countE " + s + " " + countE(s));

        s = "Sydney";
        System.out.println("countE " + s + " " + countE(s));

        s = "Nola";
        System.out.println("countE " + s + " " + countE(s));

        System.out.println("sum(5): " + sum(5)); // 15
        System.out.println("sum(5): " + sum(6)); // 21
                                                 
        System.out.println("binimate(banana): " + binimate("banana"));
           
        
    }
}



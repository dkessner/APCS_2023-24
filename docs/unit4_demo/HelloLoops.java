//
// HelloLoops.java
//


public class HelloLoops
{
    public static void main(String[] args)
    {
        // int i=0  // initialization
        // i<5      // condition
        // i++      // update

        for (int i=0; i<5; i++)
        {
            boolean a = true;
            System.out.println(i + " " + a);
        }

        // System.out.println(a); // error: out of scope
        // System.out.println(i); // error: out of scope

        System.out.println();

        int i = 0;  // initialization
        while (i<10) // condition
        {
            i++;        // update

            if (i == 5)
                continue;   // go to next iteration

            if (i == 7)
                break;      // break out of loop

            System.out.println(i);
        }

        System.out.println();

        i = 0;
        do 
        {
            System.out.println(i);
            i++;
        } while (i<5);

    }
}



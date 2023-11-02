//
// Average.java
//


public class Average
{
    public static void testAverage(double[] values, double expected)
    {
        // 1) run our function

        double result = average(values);

        // 2) print stuff (input, expected, result)

        for (double x : values)
            System.out.print(x + " ");

        System.out.println();

        System.out.println("expected: " + expected + " result: " + result);

        // 3) check if test passes

        if (Math.abs(expected - result) < 1e-6)
            System.out.println("Woohoo!");
        else
            System.out.println("Uh oh.");

        System.out.println();
    }

    public static double average(double[] values)
    {
        double total = 0;

        for (double x : values)
        {
            total += x;    
        }

        return total/values.length;
    }

    public static void main(String[] args)
    {
        double[] numbers = {100, 101, 102};
        double[] numbers2 = {1, 2, 3, 4, 5};

        double[] numbers3 = new double[4];
        numbers3[0] = 1000;
        numbers3[1] = 2000;
        numbers3[2] = 3000;
        numbers3[3] = 4000;

        double[] numbers4 = {3, 3, 4};

        testAverage(numbers, 101);
        testAverage(numbers2, 3);
        testAverage(numbers3, 2500);
        testAverage(numbers4, 3.333333333); 
    }
}




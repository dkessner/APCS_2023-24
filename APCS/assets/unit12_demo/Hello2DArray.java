//
// Hello2DArray.java
//


public class Hello2DArray
{
    public static void printStuff(int[][] values)
    {
        for (int i=0; i<values.length; i++)
        {
            for (int j=0; j<values[i].length; j++)
            {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printStuff2(int[][] values)
    {
        for (int[] row : values)
        {
            for (int value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int getSum(int[][] values)
    {
        int total = 0;

        for (int[] row : values)
            for (int value : row)
                total += value;

        return total;
    }

    public static void main(String[] args)
    {
        int[][] values = { {1, 3, 5}, 
                           {2, 4},
                           {6} };

        System.out.println("values[0][1]: " + values[0][1]); // 3
        System.out.println("values[2][0]: " + values[2][0]); // 6

        printStuff(values);
        values[1][1] = 0x29a;
        printStuff2(values);

        // create array alternating 0, 1:
        // 1 0 1 0
        // 0 1 0 1
        // 1 0 1 0
        // 0 1 0 1

        int[][] checkers = new int[4][4];
        for (int i=0; i<4; i++)
        {
            for (int j=0; j<4; j++)
            {
                checkers[i][j] = (i+j+1)%2;
            }
        }

        printStuff2(checkers);

        System.out.println("sum: " + getSum(values));
        System.out.println("sum checkers: " + getSum(checkers));
    }
}



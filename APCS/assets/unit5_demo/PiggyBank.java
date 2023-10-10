//
// PiggyBank.java
//


public class PiggyBank
{
    public PiggyBank()
    {
        total = 0;
    }

    public void addNickel()
    {
        total += 5;
    }

    public void addDime()
    {
        total += 10;
    }

    public void addQuarter()
    {
        total += 25;
    }

    public int getTotal()
    {
        return total;
    }

    private int total;
}



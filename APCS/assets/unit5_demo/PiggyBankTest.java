//
// PiggyBankTest.java
//


public class PiggyBankTest
{
    public static void main(String[] args)
    {
        PiggyBank p = new PiggyBank();

        p.addNickel();
        p.addNickel();
        p.addNickel();
        p.addDime();
        p.addDime();
        p.addQuarter();
        p.addQuarter();
        p.addQuarter();

        System.out.println("total: " + p.getTotal());
    }
}



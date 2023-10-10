//
// CoinFlipper.java
//


public class CoinFlipper
{
    public String flipCoin()
    {
        double roll = Math.random();


        if (roll < .9)
            return "Heads";
        else
            return "Tails";


        /*
        int randomInt = (int)(Math.random() * 2); // 0 or 1

        if (randomInt == 0)
            return "Heads";
        else
            return "Tails";
        */
    }
}



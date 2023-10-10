//
// CoinFlipperTest.java
//


public class CoinFlipperTest
{
    public static void main(String[] args)
    {
        CoinFlipper flipper = new CoinFlipper();

        for (int i=0; i<5; i++)
        {
            System.out.println("flip: " + flipper.flipCoin());
        }
    }
}



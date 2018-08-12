package ShopTests;

import Accessories.DrumSticks;
import Instruments.InstrumentType;
import Instruments.Piano;
import Instruments.Saxophone;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Piano piano;
    DrumSticks drumSticks;
    Saxophone saxophone;


    @Before
    public void before(){
        shop = new Shop("Magic Melodies");
        piano = new Piano("wood", "black", InstrumentType.KEYBOARD, 45,120, 450 );
        drumSticks = new DrumSticks("this is a pair of sticks", 5, 30);
        saxophone = new Saxophone("metal", "gold", InstrumentType.BRASS, 20, 75,4);
    }

    @Test
    public void shopHasName(){
        assertEquals("Magic Melodies", shop.getName());
    }

    @Test
    public void shopIsEmpty(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void addToShop(){
        shop.addToStock(piano);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void addMultipleToShop(){
        shop.addToStock(piano);
        shop.addToStock(drumSticks);
        shop.addToStock(saxophone);
        assertEquals(3, shop.getStock().size());
    }

    @Test
    public void removeFromStock(){
        shop.addToStock(piano);
        shop.addToStock(drumSticks);
        shop.removeFromStock(piano);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void calculateTotalPotentialProfit(){
        shop.addToStock(piano);
        shop.addToStock(drumSticks);
        shop.removeFromStock(piano);
        assertEquals(5.00, shop.calculatePotentialProfit(),0);
    }
}

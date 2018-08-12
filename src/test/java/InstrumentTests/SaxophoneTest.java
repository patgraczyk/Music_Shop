package InstrumentTests;

import Instruments.InstrumentType;
import Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("metal", "gold", InstrumentType.BRASS, 20, 75,4);
    }

    @Test
    public void hasMaterial(){
        assertEquals("metal", saxophone.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("gold", saxophone.getColour());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.BRASS, saxophone.getType());
    }

    @Test
    public void hasPriceBoughtFor(){
        assertEquals(20, saxophone.getPriceBoughtFor());
    }

    @Test
    public void hasPriceSoldFor(){
        assertEquals(75, saxophone.getPriceSoldFor());
    }

    @Test
    public void checkMarkup(){
        assertEquals(2.0, saxophone.calculateMarkup(),0);
    }
}

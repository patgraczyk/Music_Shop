package InstrumentTests;

import Instruments.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("wood", "black", InstrumentType.KEYBOARD, 45,120, 450 );

    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void hasPriceBoughtFor(){
        assertEquals(120, piano.getPriceBoughtFor());
    }

    @Test
    public void hasPriceSoldFor(){
        assertEquals(450, piano.getPriceSoldFor());
    }

    @Test
    public void checkMarkup(){
        assertEquals(2.0, piano.calculateMarkup(),0);
    }
}

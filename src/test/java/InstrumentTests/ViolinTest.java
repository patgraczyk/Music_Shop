package InstrumentTests;

import Instruments.InstrumentType;
import Instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin("wood", "brown", InstrumentType.BRASS, 5 );
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", violin.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("brown", violin.getColour());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentType.BRASS, violin.getType());
    }

}

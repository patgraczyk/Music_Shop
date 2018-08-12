package AccessoriesTests;

import Accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("this is a pair of sticks", 5, 30);
    }

    @Test
    public void hasDescription(){
        assertEquals("this is a pair of sticks", drumSticks.getDescription());
    }

    @Test
    public void hasPriceBoughtFor(){
        assertEquals(5, drumSticks.getPriceBoughtFor());
    }

    @Test
    public void  hasPriceSoldFor(){
        assertEquals(30, drumSticks.getPriceSoldFor());
    }

    @Test
    public void checkMarkup(){
        assertEquals(5.0, drumSticks.calculateMarkup(),0);
    }
}

package AccessoriesTests;

import Accessories.MusicSheets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSheetTest {

    MusicSheets musicSheets;

    @Before
    public void before(){
        musicSheets = new MusicSheets("this is an item", 20, 40);
    }

    @Test
    public void hasDescription(){
        assertEquals("this is an item", musicSheets.getDescription());
    }

    @Test
    public void hasPriceBoughtFor(){
        assertEquals(20, musicSheets.getPriceBoughtFor());
    }

    @Test
    public void  hasPriceSoldFor(){
        assertEquals(40, musicSheets.getPriceSoldFor());
    }

    @Test
    public void checkMarkup(){
        assertEquals(1.0, musicSheets.calculateMarkup(),0);
    }
}

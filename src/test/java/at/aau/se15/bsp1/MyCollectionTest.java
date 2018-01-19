package at.aau.se15.bsp1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MyCollectionTest
{
    private MyCollection c;
    @Before
    public void setup() {
        c = new MyCollection(5);
        c.add("1");
        c.add("2");
        c.add("3");
    }
    @Test
    public void testSizeSimple() {
        assertEquals(3,c.size());
    }
}

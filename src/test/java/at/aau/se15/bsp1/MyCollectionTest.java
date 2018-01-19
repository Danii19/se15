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
    @Test
    public void testRemove() {
    	MyCollection c2 = new MyCollection(5);
    	c2.add("1");
        c2.add("2");
        c.remove("3");
        assertEquals(c2.getList(),c.getList());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRemove2() {
    	MyCollection c2 = new MyCollection(5);
        c2.remove("3");
    }
    @Test(expected = IllegalArgumentException.class)
    public void testRemove3() {
        c.remove("4");
    }
    @Test
    public void testEmpty() {
    	MyCollection c2 = new MyCollection(5);
        c.empty();
        assertEquals(c2.getList(),c.getList());
    }
    
}

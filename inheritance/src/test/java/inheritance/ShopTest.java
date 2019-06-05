package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    @Test
    public void toStringTest() {
        Shop classUnderTest = new Shop("Little Shop", "This is a shop.", 2);

        assertEquals("test toString",
                "Shop: Little Shop \nDescription: This is a shop. \nPrice: 2",
                classUnderTest.toString());
    }
}
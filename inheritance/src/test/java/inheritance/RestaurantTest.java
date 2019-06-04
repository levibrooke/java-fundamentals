package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void toStringTest() {
        Restaurant classUnderTest = new Restaurant("Test Restaurant", 3, 2);

        assertEquals("test constructor and toString method",
                "A restaurant named Test Restaurant, with 3 stars and is in 2 price category",
                classUnderTest.toString());
    }
}
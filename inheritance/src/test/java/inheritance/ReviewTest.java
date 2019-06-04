package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Test
    public void toStringTest() {
        Review classUnderTest = new Review("This is a review.", "A Reviewer", 2, "Test Restaurant");

        assertEquals("test constructor and toString method",
                "A review: This is a review. \n By: A Reviewer \n Stars: 2",
                classUnderTest.toString());
    }
}
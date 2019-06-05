package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void toStringTest() {
        Restaurant classUnderTest = new Restaurant("Test Restaurant", 2);

        assertEquals("test constructor and toString method",
                "A restaurant named Test Restaurant and is in 2 price category",
                classUnderTest.toString());
    }

    @Test
    public void addReviewTest() {
        Restaurant newRestaurant = new Restaurant("A Restaurant", 2);
        Review newReview = new Review("This is a review.", "A Reviewer", 2, newRestaurant);

        assertEquals("test add review",
                "Review successfully added.",
                newRestaurant.addReview(newReview));
    }

    @Test
    // this test is currently broken bc i need to fix my rating calc
    public void checkRestaurantRating() {
        Restaurant newRestaurant = new Restaurant("Test Restaurant", 2);
        Review newReview = new Review("This is a review.", "A Reviewer", 2, newRestaurant);

        Review anotherReview = new Review("This is a review.", "A Reviewer", 3, newRestaurant);

        newRestaurant.addReview(newReview);
        newRestaurant.addReview(anotherReview);

        assertEquals(3,
                newRestaurant.getRating());
    }
}
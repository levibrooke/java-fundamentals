package basicLibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MapsTest {

    @Test
    public void testWeatherData() {
        Maps classUnderTest = new Maps();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String expectedResult = "High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69";

        String result = classUnderTest.weatherData(weeklyMonthTemperatures);
        System.out.print(result);

        assertEquals(expectedResult, result);
    }

    @Test
    public void testWeatherDataFail() {
        Maps classUnderTest = new Maps();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String expectedResult = "High: 72\n" +
                "Low: 50\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69";

        String result = classUnderTest.weatherData(weeklyMonthTemperatures);
        System.out.print(result);

        assertNotEquals(expectedResult, result);
    }

    @Test
    public void testTally() {
        Maps classUnderTest = new Maps();
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String result = classUnderTest.tally(votes);

        assertEquals("Bush", result);
    }
}

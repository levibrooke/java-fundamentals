package basicLibrary;

import java.util.*;

public class Maps {
    public static String weatherData(int[][] inputWeather) {

        Set<Integer> temps = new HashSet<>();
        int min = inputWeather[0][0];
        int max = inputWeather[0][0];

        for (int i = 0; i < inputWeather.length; i++) {
            for (int j = 0; j < inputWeather[i].length; j++) {
                temps.add(inputWeather[i][j]);

                if (inputWeather[i][j] < min) {
                    min = inputWeather[i][j];
                }
                else if (inputWeather[i][j] > max) {
                    max = inputWeather[i][j];
                }
            }
        }

        String result = new String();
        result += "High: " + max + "\nLow: " + min;

        for (int i = min + 1; i < max; i++) {
            if (!temps.contains(i)) {
                result += "\nNever saw temperature: " + i;
            }
        }

        return result;
    }
}

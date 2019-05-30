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

        String result = "";
        result += "High: " + max + "\nLow: " + min;

        for (int i = min + 1; i < max; i++) {
            if (!temps.contains(i)) {
                result += "\nNever saw temperature: " + i;
            }
        }

        return result;
    }

    public static String tally(List<String> inputList) {
        String result = "";
        HashMap<String, Integer> tallyList = new HashMap<>();

        for (int i = 0; i < inputList.size(); i++) {
            if (!tallyList.containsKey(inputList.get(i))) {
                tallyList.put(inputList.get(i), 1);
            }
            else if (tallyList.containsKey(inputList.get(i))) {
                tallyList.put(inputList.get(i), tallyList.get(inputList.get(i)) + 1);
            }
        }

        System.out.println(tallyList);

        int highestVote = 0;

        for (Map.Entry<String, Integer> entry : tallyList.entrySet()) {
            if (entry.getValue() > highestVote) {
                result = entry.getKey();
                highestVote = entry.getValue();
            }
        }

        System.out.println(result);

        return result;
    }
}

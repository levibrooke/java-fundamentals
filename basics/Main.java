import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    // Pluralize
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    // Flipping Coins
    flipNHeads(1);
    flipNHeads(5);

    // Command Line Clock
    clock();
  }

  public static String pluralize(String word, int num) {
    if (num == 1) {
      return word;
    }
    return word + "s";
  }

  public static void flipNHeads(int n) {
    int headsCount = 0;
    int flips = 0;

    while (headsCount < n) {
      flips++;
      if (Math.random() < 0.5) {
        headsCount = 0;
        System.out.println("tails");
      }
      else if (Math.random() >= 0.5) {
        headsCount++;
        System.out.println("heads");
      }
    }
    System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
  }

  public static void clock() {
    LocalDateTime prev = LocalDateTime.now();
    int prevSeconds = prev.getSecond();

    while (true) {
      LocalDateTime curr = LocalDateTime.now();
      int currSeconds = curr.getSecond();

      if (currSeconds != prevSeconds) {
        String time = curr.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time);
        prevSeconds = currSeconds;
      }
    }
  }
}
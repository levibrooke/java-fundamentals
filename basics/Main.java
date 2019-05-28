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
}